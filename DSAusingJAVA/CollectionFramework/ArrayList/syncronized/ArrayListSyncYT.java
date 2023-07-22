import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSyncYT {

    // static List<String> list=new ArrayList<>();
    static List<String> list=Collections.synchronizedList(new ArrayList<>());
    public static void main(String[] args) throws InterruptedException
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        
        t2.start();
        for (int i = 0; i < 10; i++) 
        {
            list.add("Added "+String.valueOf(i)+" By "+Thread.currentThread().getName());
            Thread.sleep(1000);//inconsistency
        }
        t1.start();
        

    }
}
class Thread1 extends Thread
{
    @Override
    public void run() {
        synchronized(ArrayListSyncYT.list)
        {
            Iterator<String> itr=ArrayListSyncYT.list.iterator();
            while (itr.hasNext()) 
            {
                System.out.println(itr.next()+" By "+Thread.currentThread().getName());
            }
        }
    }
    
}

class Thread2 extends Thread
{
    @Override
    public void run() {
        
        for (int j = 10; j < 15; j++) 
        {
            ArrayListSyncYT.list.add("Added "+String.valueOf(j+" By "+Thread.currentThread().getName()));
        }
    }
    
}