class MyThread1 extends Thread
{
    public void run() {
        System.out.println(" Thread 1   :"+ Thread.currentThread().getPriority());
        for(int i=0;i<5;i++)
        {
            System.out.println("Executing : "+Thread.currentThread().getName());
        }
    }
}
class MyThread2 extends Thread
{
    public void run() {
        System.out.println(" Thread 2   :"+ Thread.currentThread().getPriority());
        for(int i=0;i<5;i++)
        {
            try{
            Thread.currentThread().sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.println("Executing... : "+Thread.currentThread().getName());
        }
    }
}

public class StopThread {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(" main Thread "+ Thread.currentThread().getPriority());
       System.out.println("Executing  ---- "+Thread.currentThread().getName());
       MyThread1 t1=new MyThread1();
       MyThread2 t2=new MyThread2();

       t1.start();
       t2.start();

       for (int i = 0; i < 5; i++) {
           Thread.currentThread().sleep(2000);
           System.out.println("Running Thread : "+Thread.currentThread().getName());
       }
    }
}