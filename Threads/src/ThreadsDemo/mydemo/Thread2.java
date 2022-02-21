class Thread2 extends Thread
{
    Thread2(String ThreadName)
    {
        super(ThreadName);
    }
    public void run() {
        Threadfxn();
    }
    void Threadfxn()
    {
        System.out.println("hii i am thread1 "+Thread.currentThread().getName());
    }
}
class Thread3 extends Thread
{
    Thread3(String ThreadName)
    {
        super(ThreadName);
    }
    public void run() {
        Threadfxn();
    }
    void Threadfxn()
    {
        System.out.println("hii i am thread2 "+Thread.currentThread().getName());
    }
}
class Main 
{
    public static void main(String[] args) throws InterruptedException {
     
        Thread t1=new Thread2("Khana banana");
        Thread t2=new Thread3("Khana khana");

        t1.start();
        t1.sleep(2000);
        t2.start();
    }
}