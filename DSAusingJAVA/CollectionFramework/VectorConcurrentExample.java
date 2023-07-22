import java.util.Vector;

public class VectorConcurrentExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        Runnable addTask = () -> {
            for (int i = 0; i < 10; i++) {
                vector.add(i);
            }
        };

        Thread thread1 = new Thread(addTask);
        Thread thread2 = new Thread(addTask);

        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Vector size: " + vector.size());
        System.out.println(vector);
    }
}
