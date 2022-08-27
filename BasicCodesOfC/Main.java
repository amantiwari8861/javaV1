import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        
        // Executor executor=Executors.newCachedThreadPool();
        // Executor executor=Executors.newSingleThreadExecutor();
        // Executor executor=Executors.newFixedThreadPool(8);
        Executor executor=Executors.newSingleThreadScheduledExecutor();
        for (int j = 1; j <= 100; j++) {
            // Print1 p=new Print1(j);
            // Thread t1=new Thread(p);
            // t1.start();
            // executor.execute(t1); 
            executor.execute(new Print1(j));  
        }

       

    }
}