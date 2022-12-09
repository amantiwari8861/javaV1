class Greet extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Good Morning ! by "+Thread.currentThread().getName());
    }
}
public class Threads1
{
    public static void main(String[] args) {
        
        // System.out.println(1/0);
        System.out.println(Thread.currentThread().getName());
        
        Greet g=new Greet();
        Thread t1=new Thread(g);
        t1.start();
        // t1.start();

    }
}