import java.util.ArrayList;
import java.util.List;

public class ArrayListConcurrentExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        Runnable addTask = () -> {
            for (int i = 0; i < 10; i++) {
                arrayList.add(i);
            }
        };

        Thread thread1 = new Thread(addTask);
        Thread thread2 = new Thread(addTask);

        thread1.start();
        thread2.start();

        //Wait for both threads to finish
        // try {
        //     thread1.join();
        //     thread2.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println(arrayList);
    }
}
