package concurrency.visibility;

class SharedResource 
{
    private boolean flag;
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
public class TestVolatile 
{
    public static void main(String[] args) {
        
        SharedResource sharedResource=new SharedResource();
        Runnable runnableObj1=()->{
            System.out.println("Thread 1 started");
            try {
                System.out.println("Thread 1 logic started");
                Thread.sleep(2000);
                System.out.println("Thread 1 logic completed");
                sharedResource.setFlag(true);
                System.out.println("flag set by thread 1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable runnableObj2=()->{
            System.out.println("Thread 2 started");
            while (!sharedResource.isFlag()) {
                System.out.print(".");
            }
            System.out.println("\nThread 2 logic completed");
        };
        Thread t1=new Thread(runnableObj1);
        t1.start();
        Thread t2=new Thread(runnableObj2);
        t2.start();
    }
}
