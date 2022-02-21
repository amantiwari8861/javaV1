class MyThread1 extends Thread
{ 
    public void run()
    {
        System.out.println("hello i am a Thread");
        try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("State of thread after calling .sleep() method on it - "+ this.getState() );

    }
}
public class ThreadState
{
    public static void main(String[] args) throws InterruptedException {

        Thread t1=new Thread(new MyThread1(),"My Thread");
        System.out.println("The Thread is :"+t1);
        System.out.println( " Name : "+t1.getName() +"  initial state : "+t1.getState() );
        t1.start();
        System.out.println(t1.getState());
        t1.sleep(2000);
        System.out.println(t1.getState());
    }
}