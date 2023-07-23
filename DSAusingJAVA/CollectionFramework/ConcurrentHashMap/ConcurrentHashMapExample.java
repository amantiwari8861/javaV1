import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        // Create a fixed thread pool with 5 threads
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // Runnable task to add key-value pairs
        Runnable putTask = () -> {
            for (int i = 1; i <= 10; i++) {
                String key = "Key_" + i;
                int value = i * 10;
                concurrentMap.put(key, value);
                System.out.println(Thread.currentThread().getName() + " added: " + key + " -> " + value);
            }
        };

        // Runnable task to read values
        Runnable getTask = () -> {
            for (int i = 0; i < 10; i++) {
                String key = "Key_" + i;
                int value = concurrentMap.get(key);
                System.out.println(Thread.currentThread().getName() + " read: " + key + " -> " + value);
            }
        };

        // Submit tasks to the executor
        for (int i = 0; i < 3; i++) {
            executorService.submit(putTask);
        }

        for (int i = 0; i < 2; i++) {
            executorService.submit(getTask);
        }

        // Shutdown the executor
        executorService.shutdown();
        System.out.println(concurrentMap);
    }
}
