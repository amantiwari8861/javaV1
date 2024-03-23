// import java.util.concurrent.Executor;
// import java.util.concurrent.ExecutorService;
// import java.util.concurrent.Executors;

// import callables.GetSum;
// import runnables.Printer2;
// import stringbuffervsbuilder.TestBuilderBuffer;
// import thread.Printer;

// public class App 
// {
//     public static void main(String[] args) throws Exception 
//     {
        // System.out.println(10/0);

        // Thread t=Thread.currentThread();
        // t.setName("Main Thread");
        // System.out.println(t);
        // t.sleep(2000);
        // System.out.println(t.getName());

        // Printer p=new Printer(10000);
        // Printer p1=new Printer(300);
        // Printer p2=new Printer(300);

        // Thread t1=new Thread(p);
        // Thread t2=new Thread(p1);
        // Thread t3=new Thread(p2);
        
        // t1.start();
        // // t1.join();
        // t2.start();
        // t2.start();// we can't start a dead thread again
        // // t2.join();
        // t3.start();
        // // t3.join();  

        // Thread t4=new Thread(new Printer2(1));
        // t4.start();

        // for (int i = 0; i < 100; i++) 
        // {
        //     new Thread(new Printer2(i)).start();
        // }

        // Thread t=new Thread(()->{System.out.println("hello");});
        // Runnable runObj=()->{System.out.println("hii i am thread");};

        // ExecutorService executor=Executors.newSingleThreadExecutor();
        // ExecutorService executor=Executors.newFixedThreadPool(10);
        // ExecutorService executor=Executors.newCachedThreadPool();

        // for (int i = 1; i <= 100; i++) 
        // {
        //     // executor.execute(new Printer2(i));
        //     executor.submit(new Printer2(i));
        // }
        // executor.shutdown();
        
        // new Runnable() {
        //     @Override
        //     public void run() {
        //         System.out.println("Hiiii");
        //     }
        // }.run();

        // new Thread(new Printer(10)).start();
        // new Thread(new Printer(5)).start();
        // new Thread(new Printer(8)).start();
        // new TestBuilderBuffer().test();

        // for (int i = 1; i <= 10; i++) 
        // {
        //    System.out.println(new GetSum(i).call());
        // }
        


//     }
// }