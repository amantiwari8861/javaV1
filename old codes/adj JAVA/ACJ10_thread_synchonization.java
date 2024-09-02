


// thread synchonization in java
// thread synchonization is the control the access of two or more/multiple threads from any program/method.
// thread sync is great option when we need to allow one thread to use/access shared resource.

// types of synchroniziation
//  1. process synchonization
//  2. thread synchonization


// import java.util.*;
/**
 * data1
 */
class data1
{
    synchronized void printdata1(int n)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i*n);
            try
            {
                Thread.sleep(400);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }    
}

/**
 * mt1 ex
 */
class mt1 extends Thread
{
    data1 d1;
    mt1(data1 d1)
    {
        this.d1=d1;
    }
    
    public void mt_run1()
    {
        d1.printdata1(5);    
    }
    
}


/**
 * mt2 
 */
class mt2 extends Thread
{
    data1 d1;
    mt2(data1 d1)
    {
        this.d1=d1;
    }
    
    public void mt_run1()
    {
        d1.printdata1(100);    
    }
    
}
public class ACJ10_thread_synchonization
{
    public static void main(String[] args) 
    {
        data1 d1 = new data1();
        mt1 t1=new mt1(d1);
        mt2 t2=new mt2(d1);
        t1.start();
        t2.start();      
    }    
}