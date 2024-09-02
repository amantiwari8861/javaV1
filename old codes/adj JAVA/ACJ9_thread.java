

// what is thread in java?
// thread is program that allows to operate more efficiently.
// With tread we can doing multiple things at the same time.
// we can create a thread by :-
//     1. extending thread class
//     2. implementing runnable interface



import java.util.*;
/**
 * InnerACJ9_thread
 */
class InnerACJ9_thread extends Thread
{
    public void show()
    {
        System.out.println("this is thread class.");
    }
}

/**
 * ACJ9_thread
 */
public class ACJ9_thread {

    public static void main(String[] args) {
        InnerACJ9_thread iacj9t_1 =new InnerACJ9_thread();
        iacj9t_1.show();        
    }
}








// /**
//  * ACJ9_thread
//  */
// public class ACJ9_thread extends Thread{

//     public static void main(String[] args){
//         ACJ9_thread acj9_1 = new ACJ9_thread();
//         acj9_1.start();
//         System.out.println("the starting of thread.");
//     }
// }









// /**
//  * ACJ9_thread
//  */
// public class ACJ9_thread extends Thread{

//     public static void main(String[] args){
//         ACJ9_thread acj9_1 = new ACJ9_thread();
//         acj9_1.start();
//         System.out.println("the starting of thread.");
//     }
//     public void run()
//     {
//         System.out.print("this is end function");
//     }
// }





// /**
//  * ACJ9_thread
//  */
// public class ACJ9_thread implements Runnable
// {
//     public static void main(String[] args)
//     {
//         ACJ9_thread acj9_1 = new ACJ9_thread();
//         Thread t1 = new Thread(acj9_1);
//         t1.start();
//         System.out.println("the starting of thread.");
//     }
//     public void run()
//     {
//         System.out.print("this is end function");
//     }
// }













// /**
//  * ACJ9_thread
//  */
// public class ACJ9_thread extends Thread
// {
//     public static int age=1;
//     public static void main(String[] args)
//     {
//         ACJ9_thread acj9_1 = new ACJ9_thread();
//         acj9_1.start();
//         System.out.println(age);
//         age++;
//         System.out.println(age);
//     }
//     public void run()
//     {
//         age++;
//     }
// }











// /**
//  * ACJ9_thread
//  */
// public class ACJ9_thread extends Thread
// {
//     public static int age=1;
//     public static void main(String[] args)
//     {
//         ACJ9_thread acj9_1 = new ACJ9_thread();
//         acj9_1.start();
//         while(acj9_1.isAlive())
//         {
//             System.out.println("alive is working");
//         }
//         System.out.println("age is "+age);
//         age++;
//         System.out.println("new age is "+age);
//     }
//     public void run()
//     {
//         age++;
//     }
// }