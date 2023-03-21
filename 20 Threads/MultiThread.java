class GreetThread implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Good Morning by "+Thread.currentThread().getName());
    }
}
public class MultiThread 
{
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) 
        {
            GreetThread gt=new GreetThread();
            Thread t=new Thread(gt);
            t.start();
        }
        
    }
}