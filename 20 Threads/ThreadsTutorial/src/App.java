import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import callableInteface.CallableTask;

public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hii by "+Thread.currentThread().getName());
        // PrintNum pn=new PrintNum();
        // Thread t1=new Thread(pn);
        // t1.start();
        // t1.start(); //exception

        // for (int i = 20; i <= 30; i++) 
        // {
        //     // Thread t2=new Thread(new PrintNum(i));
        //     Thread t2=new Thread(new PrintNum2(i));
        //     t2.start();
        //     Thread.sleep(1000);
        // }

        new Runnable() { //Anonymous Inner Class
            @Override
            public void run()
            {
                System.out.println("Hello i am a Thread");
            }
        }.run();

        new Thread(() -> System.out.println("Hii i am a thread.")).start();

        //Running 100 separate Thread
        // for (int i = 1; i <= 100; i++) 
        // {
        //     PrintNum pn=new PrintNum(i);
        //     Thread t=new Thread(pn);
        //     t.start();
        // }
        // ExecutorService eService=Executors.newFixedThreadPool(10);
        // ExecutorService eService=Executors.newSingleThreadExecutor();
        // for (int i = 1; i <= 100; i++) 
        // {
        //     PrintNum2 pn=new PrintNum2(i);
        //     eService.execute(pn);
        // }
        // eService.shutdown();

        // ExecutorService eService=Executors.newFixedThreadPool(2);
        // List<Integer> data=new ArrayList<>();
        // for (int i = 1; i <= 10; i++) 
        // {
        //     Callable<Integer> callableTask = new CallableTask(i);
        //     Future<Integer> future = eService.submit(callableTask);
        //     data.add(future.get());
        // }
        // System.out.println("The Data is "+data);
        // eService.shutdown();
      
        System.out.println("Byee by "+Thread.currentThread().getName());
    }
}
