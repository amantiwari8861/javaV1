// let t4 priority is higher and its doesn't mean t4 will finish first,
// Furthermore jvm ask OS for threads and all priorities sets in deep layer of OS,
// you are just set a recommendation,it depends on many things!

class MyThread1 implements Runnable
{
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 10; i++) {
            Thread.yield();
            System.out.println("step "+i);
        }
    }
}
public class Yield2 {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
        Thread t1=new Thread(new MyThread1());
        // t1.setPriority(10);
        // t1.setPriority(Thread.MIN_PRIORITY); //1
        // t1.setPriority(Thread.MAX_PRIORITY); //10
        t1.setPriority(Thread.NORM_PRIORITY); //5
        t1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("step at main "+i);
        }
    }
    
}