import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Print100 
{
    public static void main(String[] args) {
        
        //Running 100 separate Thread
        // for (int i = 1; i <= 100; i++) 
        // {
        //     PrintNum pn=new PrintNum(i);
        //     Thread t=new Thread(pn);
        //     t.start();
        // }
        ExecutorService eService=null;
        for (int i = 1; i <= 100; i++) 
        {
            PrintNum pn=new PrintNum(i);
            // eService=Executors.newSingleThreadExecutor();
            eService=Executors.newFixedThreadPool(10);
            eService.execute(pn);
        }
        eService.shutdown();
    }
}
