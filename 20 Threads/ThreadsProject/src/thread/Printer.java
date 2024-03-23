package thread;

public class Printer  extends Thread
{
    int num;
    public Printer(int num)
    {
        this.num=num;
    }
    @Override
    public void run() 
    {
        for (int i = 1; i <= num; i++) 
        {
            System.out.println("Num="+i+" Printed by "+Thread.currentThread().getName());
            // try 
            // {
			// 	Thread.sleep(1000);
			// } 
            // catch (InterruptedException e) 
            // {
			// 	e.printStackTrace();
			// }
        }
    }
}
