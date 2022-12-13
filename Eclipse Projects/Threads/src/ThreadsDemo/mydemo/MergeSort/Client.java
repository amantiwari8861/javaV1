import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listToSort = List.of(38,27,43,3,9,82,10 );
        // List<Integer> sortedArray = executorService.submit(new ArraySorter(listToSort)).get();

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        ArraySorter as=new ArraySorter(listToSort);
        Future<List<Integer>> futureList=executorService.submit(as);
        List<Integer> sortedArray=futureList.get();

        for (int i = 0; i < sortedArray.size(); ++i) 
        {
            System.out.print(sortedArray.get(i)+" ");
        }
        executorService.shutdown();
    }
}