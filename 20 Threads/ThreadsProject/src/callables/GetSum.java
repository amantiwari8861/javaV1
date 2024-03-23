package callables;

import java.util.concurrent.Callable;

public class GetSum implements Callable<Integer> 
{
    static int sum;
    int num;
    public GetSum(int num)
    {
        this.num=num;
    }
    @Override
    public Integer call()
    {
        inc(num);
        return sum;
    }
    public static void inc(int num)
    {
        sum+=num;
    }
}
