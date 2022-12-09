import java.util.concurrent.Callable;

// Callable can return the result of the parallel processing of a task.
public class ExecutorPrint implements Callable<Integer>
{
    int n;
    ExecutorPrint(int n)
    {
        this.n=n;
    }

    @Override
    public Integer call() throws Exception {
        return n;
    }    
}