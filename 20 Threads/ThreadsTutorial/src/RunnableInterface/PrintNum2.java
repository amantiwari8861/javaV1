package RunnableInterface;

public class PrintNum2 implements Runnable
{
    int num;
    public PrintNum2(){}
    public PrintNum2(int num)
    {
        this.num=num;
    }

    @Override
    public void run() 
    {
        System.out.println(num+" "+Thread.currentThread().getName());

    }
}