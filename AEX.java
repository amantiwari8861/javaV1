import java.util.Scanner;
class AEX
{
    public static void main(String[] args) {  
        try{
            int num1,num2,result;
            Scanner obj=new Scanner(System.in);
            System.out.println("enter 2 numbers ");
            num1=obj.nextInt();
            num2=obj.nextInt();
            result=num1/num2;// 10/0
            System.out.println("the result is "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero condition pls give a valid no. 1");
            // e.printStackTrace();
        }
        catch(RuntimeException e)
        {
            System.out.println("Divide by zero condition pls give a valid no. 2");
            // e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("Divide by zero condition pls give a valid no. 3 ");
            // e.printStackTrace();
        }
        finally
        {
            System.out.println("i am finally block i will execute always "+
            "doesn't matter error will come or not");
        }
        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");
    }
}

// try-catch block