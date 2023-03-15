class MyThread implements Runnable
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
public class Thread2nd 
{
    public static void main(String[] args) 
    {
        Thread t1=new Thread(new MyThread());
        t1.start();
        Thread t2=new Thread(new MyThread());
        t2.start();

    }
}