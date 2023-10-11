import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListExample {
    public static void main(String[] args) {
        // ArrayList (Not thread-safe)
        List<Integer> arrayList = new ArrayList<>();
        Runnable arrayListTask = () -> {
            for (int i = 0; i < 5; i++) {
                arrayList.add(i);
            }
        };

        // Vector (Thread-safe)
        List<Integer> vector = new Vector<>();
        Runnable vectorTask = () -> {
            for (int i = 0; i < 5; i++) {
                vector.add(i);
            }
        };

        // Creating threads
        Thread thread1 = new Thread(arrayListTask);
        Thread thread2 = new Thread(vectorTask);

        // Starting threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Output the contents
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Vector: " + vector);
    }
}
