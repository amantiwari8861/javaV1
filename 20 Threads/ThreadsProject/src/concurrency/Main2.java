// package concurrency;

// public class Main2 {

//     public static Object sharedObject=new Object();
//     public static void main(String[] args) {
        
//         System.out.println("Main Thread Started");
//         Runnable runnableObj=()->{
//             System.out.println(Thread.currentThread().getName()+" is running!("+Thread.currentThread().getState()+")");
//             System.out.println(sharedObject.hashCode());
//             Object localObject=new Object();
//             System.out.println(localObject.hashCode());
//             try {
//                 Thread.sleep(10000);
//             } 
//             catch (InterruptedException e) 
//             {
//                 e.printStackTrace();
//             }
//             System.out.println(Thread.currentThread().getName()+" is finished!");
//         };
//         Runnable runnableObj2=()->{
//             System.out.println(Thread.currentThread().getName()+" is running!("+Thread.currentThread().getState()+")");
//             System.out.println(sharedObject.hashCode());
//             Object localObject=new Object();
//             System.out.println(localObject.hashCode());
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
//         t.start();
//         Thread t2=new Thread(runnableObj2);
//         t2.start();
//         System.out.println("Main Thread is Finished");
//     }
// }
