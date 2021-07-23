public class Solution9  {

public static void main(String[] args) throws InterruptedException{
        yclass yy = new yclass ();
        Thread t1= new Thread(yy);
        t1.start();
        // t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("main :"+Thread.currentThread().getPriority());
        for (int i = 0; i <10; i++) {
            // t1.join(); //runs t1 first the give chance to main thread
            // t1.sleep(3000); //time in miliseconds
            // Thread.yield();
            System.out.println("during yield control => "+i +" " + Thread.currentThread().getName());
        }
        t1.start();
    }
}

class yclass implements Runnable{

    public void run() {
        System.out.println(" New Thread :"+Thread.currentThread().getPriority());
        for (int i = 0; i < 5; i++) {
            System.out.println("control in run method => " +i+" "+ Thread.currentThread().getName());
        }
    }
}


/*
We can prevent a thread from execution by using any of the 3 methods of Thread class:

sleep() causes the thread to definitely stop executing for a given amount of time; if no other thread or process needs to be run, the CPU will be idle (and probably enter a power saving mode).

yield() basically means that the thread is not doing anything particularly important and if any other threads or processes need to be run, they should. Otherwise, the current thread will continue to run.

join() If any executing thread t1 calls join() on t2 (i.e. t2.join()) immediately t1 will enter into waiting state until t2 completes its execution.
*/

//thread scheduler 
