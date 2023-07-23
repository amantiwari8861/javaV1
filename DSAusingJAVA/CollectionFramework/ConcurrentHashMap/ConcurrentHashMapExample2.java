import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample2 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // Create multiple threads for reading and writing
        int numOfThreads = 5;
        Thread[] threads = new Thread[numOfThreads];

        for (int i = 0; i < numOfThreads; i++) {
            if (i % 2 == 0) {
                threads[i] = new WriterThread(concurrentMap, "Key" + i, i);
            } else {
                threads[i] = new ReaderThread(concurrentMap, "Key" + i);
            }
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numOfThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the final contents of the ConcurrentHashMap
        System.out.println("Final ConcurrentHashMap contents:");
        concurrentMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

class ReaderThread extends Thread {
    private ConcurrentHashMap<String, Integer> map;
    private String key;

    public ReaderThread(ConcurrentHashMap<String, Integer> map, String key) {
        this.map = map;
        this.key = key;
    }

    @Override
    public void run() {
        System.out.println("Reading from thread: " + Thread.currentThread().getName());
        Integer value = map.get(key);
        System.out.println("Thread: " + Thread.currentThread().getName() + ", Key: " + key + ", Value: " + value);
    }
}

class WriterThread extends Thread {
    private ConcurrentHashMap<String, Integer> map;
    private String key;
    private int value;

    public WriterThread(ConcurrentHashMap<String, Integer> map, String key, int value) {
        this.map = map;
        this.key = key;
        this.value = value;
    }

    @Override
    public void run() {
        System.out.println("Writing from thread: " + Thread.currentThread().getName()+" -> "+value);
        map.put(key, value);
    }
}
