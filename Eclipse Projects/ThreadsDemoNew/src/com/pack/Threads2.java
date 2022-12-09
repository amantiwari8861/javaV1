
class Greet extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i+" Good Morning ! by " + Thread.currentThread().getName());
            // try {
            //     // Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }
}

class PrintNumbers extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " Good Night by " + Thread.currentThread().getName());
            // try {
            //     // Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
        }
    }
}

public class Threads2 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Greet());
        Thread t2 = new Thread(new PrintNumbers());
        System.out.println(Thread.currentThread().getName() + " Started");
        t1.start();
        t2.start();
    }
}