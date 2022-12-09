public class Client extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Hello by "+Thread.currentThread().getName());
    }
    
}