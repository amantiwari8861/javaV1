// package concurrency;

// public class Main {
//     public static void main(String[] args) {
        
//         System.out.println("Main Thread Started");
//         System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().isDaemon());
//         Runnable runnableObj=()->{
//             System.out.println(Thread.currentThread().getName()+" is running!("+Thread.currentThread().getState()+")");
//             System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().isDaemon());
//             try {
//                 Thread.sleep(10000);
//             } 
//             catch (InterruptedException e) 
//             {
//                 e.printStackTrace();
//             }
//             System.out.println(Thread.currentThread().getName()+" is finished!");
//         };
//         Thread t=new Thread(runnableObj);
//         // t.setDaemon(true);//problem
//         t.start();
//         System.out.println("Main Thread is Finished");
//     }
// }
