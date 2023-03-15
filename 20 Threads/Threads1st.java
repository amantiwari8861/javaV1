class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Hello i am "+Thread.currentThread().getName());
        greet();
    }
    void greet()
    {
        System.out.println("Good morning "+Thread.currentThread().getName());
    }
}
public class Threads1st 
{
    public static void main(String[] args) 
    {
        System.out.println("Hii i am main 1");
        MyThread t1=new MyThread();
        t1.start();  
        // t1.greet();  
        MyThread t2=new MyThread();
        t2.start();
        // t2.start();  //error
        // t2.greet();     
        System.out.println("Hii i am main 2");

    }
}