

// what is concurrency in java?
// in java programming laguage concurrency is java virtual machine have been desigend to suppert concurrent programming and all execution takes place in the context of threads. 
// like: yield(), sleep(), join() methods






// import java.lang.*;
// /**
//  * myclass
//  */
// class myclass extends Thread
// {
//     public void show()
//     {
//         for(int i=0;i<5;i++)
//         {
//             System.out.println(Thread.currentThread().getName()+" in control with loop");
//         }
//     }
// }

// /**
//  * ACJ12_javaconcurrency
//  */
// public class ACJ12_javaconcurrency
// {
//     public static void main(String[] args)
//     {
//         myclass mct1 = new myclass();
//         mct1.start();
//         mct1.show();
//         for(int i=0;i<5;i++)
//         {
//             Thread.yield();//pass value child thread
//             System.out.println(Thread.currentThread().getName()+" in control of mail class");
//         }
//     }
    
// }












// import java.lang.*;
// /**
//  * sleep1
//  */
// class sleep1 implements Runnable
// {
//     Thread t1;
//     public void run()
//     {
//         for(int i=0;i<5;i++)
//         {
//             System.out.println(Thread.currentThread().getName()+" -  "+i);
//             try
//             {
//                 Thread.sleep(1000);    
//             }
//             catch (Exception e)
//             {
//                 //TODO: handle exception
//                 System.out.println(e);
//             }
//         }    
//     }    
// }
// /**
//  * ACJ12_javaconcurrency
//  */
// public class ACJ12_javaconcurrency extends sleep1{

//     public static void main(String[] args) {
//         Thread t1= new Thread(new ACJ12_javaconcurrency());
//         t1.start();
//         Thread t2= new Thread(new ACJ12_javaconcurrency());
//         t2.start();
//     }
// }














import java.lang.*;
/**
 * ACJ12_javaconcurrency
 */
public class ACJ12_javaconcurrency implements Runnable
{
    public void run()
    {
        Thread t1=Thread.currentThread();
        System.out.println("current thread:-  "+t1.getName());
        System.out.println("current thread is alive:- "+t1.isAlive());    
    }
    public static void main(String[] args)
    {
        Thread t1=new Thread(new ACJ12_javaconcurrency());
        t1.start();
        t1.join(10000);
        System.out.println("joining after 1000 miliseconds: ");
        System.out.println("current thread:- "+t1.getName());   
        System.out.println("current thread is alive:- "+t1.isAlive());    
    }
}

 



