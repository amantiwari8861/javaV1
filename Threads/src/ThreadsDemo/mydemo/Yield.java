public class Yield  {

    public static void main(String[] args) throws InterruptedException{
            yclass yy = new yclass ();
            Thread t1= new Thread(yy);
            t1.start();
            System.out.println("main :"+Thread.currentThread().getPriority());
            for (int i = 0; i <5; i++) {
                Thread.yield();
                System.out.println("during yield control => "+i +" " + Thread.currentThread().getName());
            }
        }
    }
    
    class yclass implements Runnable{
    
        public void run() {
            System.out.println(" New Thread :"+Thread.currentThread().getPriority());
            for (int i = 0; i < 5; i++) {
                System.out.println("control   in => " +i+" "+ Thread.currentThread().getName());
            }
        }
    }
    