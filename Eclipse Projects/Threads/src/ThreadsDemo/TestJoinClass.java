/* This program demonstrates the use of some advanced thread 
 * methods, specifically sleep and join.  This class extends Thread
 * and therefore must override the run method. 
*/
package threads_01_04;

public class TestJoinClass extends Thread{
    //Constructor to assign a user defined name to the thread
    public TestJoinClass(String name)
    {
        super(name);
    }
    public void run(){  
        for(int i=1;i<=5;i++){  
        try{
            //stop the thread for 1/2 second
            Thread.sleep(500);  
            }
        catch(Exception e){System.out.println(e);}  
        System.out.println(Thread.currentThread().getName()+
                " i = "+i);  
        }  
     }
}

