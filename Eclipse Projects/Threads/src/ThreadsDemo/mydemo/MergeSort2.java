import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort2 {

   public static void main(String[] args) throws InterruptedException, ExecutionException 
   {
   //  Thread c=new Thread(new Client());
   //  c.start();

      // for (int i = 0; i <= 100; i++) 
      // {
      //    try{
      //       Thread.sleep(1000);
      //       }
      //       catch(InterruptedException ie)
      //       {
      //           System.out.println(ie.getMessage());
      //       }
      //    new Thread(new NumberPrinter(i)).start();
      //    if(i==50)
      //    break;
      // }
      ExecutorService es=Executors.newFixedThreadPool(10);
      // for (int i = 1; i <= 100; i++) {
      //    es.execute(new NumberPrinter(i));
      // }
      // System.out.println("Hello by "+Thread.currentThread().getName());

         for (int i = 0; i < 100; i++) 
         {
            Future<Integer> f= es.submit(new ExecutorPrint(i));
            System.out.println(f.get());

         }
         es.shutdown();
   } 
}