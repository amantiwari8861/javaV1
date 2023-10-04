import RunnableInterface.PrintNum2;
// import ThreadClass.PrintNum;

public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hii by "+Thread.currentThread().getName());
        // PrintNum pn=new PrintNum();
        // Thread t1=new Thread(pn);
        // t1.start();
        // t1.start(); //exception

        for (int i = 20; i <= 30; i++) 
        {
            // Thread t2=new Thread(new PrintNum(i));
            Thread t2=new Thread(new PrintNum2(i));
            t2.start();
            Thread.sleep(1000);
        }
        System.out.println("Byee by "+Thread.currentThread().getName());
    }
}
