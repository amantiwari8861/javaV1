import java.util.ArrayList;
import java.util.List;

public class ArrayListConcurrent {
    private static final int NUM_THREADS = 4; // Number of threads to use
    private static final int NUM_ELEMENTS = 1000; // Total number of elements to add

    public static void main(String[] args) throws InterruptedException {
        List<Integer> arrayList = new ArrayList<>();

        // Create an array to store the threads
        Thread[] threads = new Thread[NUM_THREADS];

        // Calculate the number of elements each thread should add
        int elementsPerThread = NUM_ELEMENTS / NUM_THREADS;

        // Start the threads
        for (int i = 0; i < NUM_THREADS; i++) {
            int startIndex = i * elementsPerThread;
            int endIndex = (i == NUM_THREADS - 1) ? NUM_ELEMENTS : startIndex + elementsPerThread;
            threads[i] = new AddThread(arrayList, startIndex, endIndex);
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            thread.join();
        }

        // Check the final size of the ArrayList
        System.out.println("Final ArrayList: " + arrayList);
    }
}

class AddThread extends Thread {
    private List<Integer> arrayList;
    private int startIndex;
    private int endIndex;

    public AddThread(List<Integer> arrayList, int startIndex, int endIndex) {
        this.arrayList = arrayList;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        // Each thread adds elements to the ArrayList within its assigned range
        for (int i = startIndex; i < endIndex; i++) {
            arrayList.add(i);
            // System.out.println("Added by "+Thread.currentThread().getName());
        }
    }
}
