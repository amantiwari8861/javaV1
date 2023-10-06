package callableInteface;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> 
{
    int num;
    public CallableTask(int num)
    {
        this.num=num;
    }
    @Override
    public Integer call()
    {
        if(num==5)
        {
            try {
                Thread.sleep(8000);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            } 
        }
        return num;
    }
}
