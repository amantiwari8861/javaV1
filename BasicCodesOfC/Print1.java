public class Print1 implements Runnable
{
    int num;
    Print1(int num)
    {
        this.num=num;
    }
    @Override
    public void run() 
    {
       System.out.println("printed "+num+" by "+Thread.currentThread().getName());
    }
}
