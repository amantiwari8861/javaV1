import java.util.Scanner;
class AEX
{
    public static void main(String[] args) 
    {  
        Scanner sc=new Scanner(System.in);
        try{
            int num1,num2,result;
            System.out.println("enter 2 numbers ");
            num1=sc.nextInt();
            num2=sc.nextInt();
            result=num1/num2;// 10/0
            System.out.println("the result is "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero condition pls give a valid no.");
            e.printStackTrace();
        }
        finally
        {
            sc.close();
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