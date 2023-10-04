package ThreadClass;

public class PrintNum extends Thread
{
    int num;
    public PrintNum(){}
    public PrintNum(int num)
    {
        this.num=num;
    }
    @Override
    public void run() 
    {
        System.out.println(num+" "+Thread.currentThread().getName());
        // try 
        // {
        //     Thread.sleep(1000);
        // } 
        // catch (InterruptedException e) 
        // {
        //     e.printStackTrace();
        // }
    }
}
