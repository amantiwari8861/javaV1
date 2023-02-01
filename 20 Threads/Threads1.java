public class Threads1 implements Runnable {
    // public void run() throws InterruptedException  //error
    public void run()
    {
        System.out.println("name :"+ Thread.currentThread().getName());
        try{
        Thread.sleep(2000);

        System.out.println("id: "+Thread.currentThread().getId());
        Thread.sleep(3000);
        System.out.println("priority :"+Thread.currentThread().getPriority());
        }
        catch(InterruptedException i)
        {
            i.printStackTrace();
        }
    }
    public static void main(String[] args) {
        
        Threads1 obj=new Threads1();
        obj.run();
    }
}