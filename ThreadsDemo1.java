// Context Switching involves storing the context or state of a process
//  so that it can be reloaded when required and execution can be resumed from the same point as earlier.
//   This is a feature of a multitasking operating system and allows a single CPU
//  to be shared by multiple processes.

public class ThreadsDemo1 implements Runnable
{
    public void run() //overriding run method of Runnable Interface
    {
        System.out.println("hii i am a thread");
    }
}
class Main 
{
    public static void main(String[] args) throws InterruptedException {
     
        ThreadsDemo1 obj=new ThreadsDemo1();
        // Thread objThread=new Thread(new ThreadsDemo1());
        Thread objThread=new Thread(obj);
        objThread.start();
        System.out.println(objThread.isAlive());
        objThread.sleep(3000);
        System.out.println(objThread.isAlive());
        objThread.start();

    }
}