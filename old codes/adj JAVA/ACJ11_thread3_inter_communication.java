//inter communication thread work in java?
//     interthread or co operation communication is allowing synchronized threads to communication with each other.

//     for work with this threads implemented this methods:-
//         1. wait
//         2. notify
//         3. notifyall







// /**
//  * student
//  */
// class student
// {
//     int feeamount=12345;

//     synchronized void submit1(int feeamount)
//     {
//         System.out.println("going to submit this month fee");

//         if(this.feeamount<feeamount)
//         {
//             System.out.println("less balance; please deposit as soon as possible");
//             try
//             {
//                 wait();
//             }
//             catch(Exception e)
//             {            }

//         }
//         this.feeamount-=feeamount;
//         System.out.println("submit completed");
//     }

//     synchronized void feedeposit(int feeamount)
//     {
//         System.out.println("going to fees deposit");
//         this.feeamount+=feeamount;
//         System.out.println("fees is deposit completed");
//         notify();
//     }
    
// }

// public class ACJ11_thread3_inter_communication
// {
//     public static void main(String[] args)
//     {
//         final student s1=new student();
//         new Thread()
//         {
//             public void run()
//             {
//                 s1.submit1(150000);
//             }
//         }.start();
        
//         new Thread()
//         {
//             public void run()
//             {
//                 s1.feedeposit(120000);
//             }
//         }.start();
        
//     }    
// }





















/**
 * student
 */
class student
{
    int feeamount=12345;

    synchronized void submit1(int feeamount)
    {
        System.out.println("going to submit this month fee "+feeamount);

        if(this.feeamount<feeamount)
        {
            System.out.println("less balance; please deposit as soon as possible "+feeamount);
            try
            {
                wait();
            }
            catch(Exception e)
            {            }

        }
        this.feeamount-=feeamount;
        System.out.println("submit completed "+feeamount);
    }

    synchronized void feedeposit(int feeamount)
    {
        System.out.println("going to fees deposit "+feeamount);
        this.feeamount+=feeamount;
        System.out.println("fees is deposit completed "+feeamount);
        notify();
    }
    
}

public class ACJ11_thread3_inter_communication
{
    public static void main(String[] args)
    {
        final student s1=new student();
        new Thread()
        {
            public void run()
            {
                s1.submit1(150000);
            }
        }.start();
        
        new Thread()
        {
            public void run()
            {
                s1.feedeposit(120000);
            }
        }.start();
        
    }    
}