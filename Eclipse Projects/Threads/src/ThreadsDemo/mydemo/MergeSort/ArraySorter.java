import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ArraySorter implements Callable <List<Integer>> {
    private List<Integer> arrayToSort;//instance variable

    public ArraySorter(List<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }

    @Override
    public List<Integer> call() throws Exception 
    {
        //base condition to stop recursion
        if (arrayToSort.size() < 2) {
            return arrayToSort;
        }

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        int mid = (arrayToSort.size()/ 2)+1;  //4

        for (int i = 0; i < mid; ++i) {
            leftList.add(arrayToSort.get(i));
        }

        for (int i = mid; i < arrayToSort.size(); ++i) {
            rightList.add(arrayToSort.get(i));
        }

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(new ArraySorter(leftList));
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(new ArraySorter(rightList));

        List<Integer> leftSortedArray = leftSortedArrayFuture.get();
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        List<Integer> sortedArray = new ArrayList<>();

        int i = 0;
        int j = 0;

        //merging two arrays in sorted order
        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                i++;
            } else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while (i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while (j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }
        executorService.shutdown();
        return sortedArray;
    }
}
// https://www.scaler.com/topics/merge-two-sorted-arrays/