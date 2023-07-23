import java.util.concurrent.ConcurrentHashMap;

class WriteData implements Runnable
{
    ConcurrentHashMap<String,Object> chm;
    String key;
    Object value;
    WriteData(ConcurrentHashMap<String,Object> chm,String k,Object v)
    {
        this.chm=chm;
        this.key=k;
        this.value=v;
    }
    @Override
    public void run() 
    {
        chm.put(key, value+" by "+Thread.currentThread().getName());
    }
}


public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        
        ConcurrentHashMap<String,Object> chm=new ConcurrentHashMap<>();
        Thread t1=new Thread(new WriteData(chm,"Name","Aman"));
        t1.start();
        Thread t2=new Thread(new WriteData(chm,"DOB","22/4/1999"));
        t2.start();
        Thread t3=new Thread(new WriteData(chm,"Address","Noida 62"));
        t3.start();
        Thread t4=new Thread(new WriteData(chm,"Salary",20000.89));
        t4.start();

        System.out.println(chm);
        try 
        {
            // Thread.sleep(1000);
            t4.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println(chm);
        chm.forEach((k,v)->{
         System.out.println(k+" : "+v);   
        });

    }
}
