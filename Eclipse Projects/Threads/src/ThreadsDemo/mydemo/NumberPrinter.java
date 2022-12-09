public class NumberPrinter implements Runnable
{
    int n;
    NumberPrinter(int n)
    {
        this.n=n;
    }

    @Override
    public void run() {
        System.out.println(n+" by "+Thread.currentThread().getName());
        
    }
}