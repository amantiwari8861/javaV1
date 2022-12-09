package mergesort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService executorService;

    public MergeSorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        int mid = arrayToSort.size()/ 2; // 2 -> 1 3 -> 1

        List<Integer> leftArray = new ArrayList<>();

        for (int i = 0; i < mid; ++i) {
            leftArray.add(arrayToSort.get(i));
        }

        List<Integer> rightArray = new ArrayList<>();

        for (int i = mid; i < arrayToSort.size(); ++i) {
            rightArray.add(arrayToSort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService);

        Future<List<Integer>> leftSortedArrayFuture = executorService.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArrayFuture = executorService.submit(rightMergeSorter);

        List<Integer> sortedArray = new ArrayList<>();

        int i = 0;
        int j = 0;

        List<Integer> leftSortedArray = leftSortedArrayFuture.get(); // code will not go to the next line till I have the sorted array
        List<Integer> rightSortedArray = rightSortedArrayFuture.get();

        while (i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if (leftSortedArray.get(i) < rightSortedArray.get(j)) {
                sortedArray.add(leftSortedArray.get(i));
                ++i;
            } else {
                sortedArray.add(rightSortedArray.get(j));
                ++j;
            }
        }

        while (i < leftSortedArray.size()) {
            sortedArray.add(leftSortedArray.get(i));
            ++i;
        }

        while (j < rightSortedArray.size()) {
            sortedArray.add(rightSortedArray.get(j));
            ++j;
        }

        return sortedArray;
    }
}

// Generics
// List<>
// HashMap<>

