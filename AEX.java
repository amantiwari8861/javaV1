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
        result=num1/num2;

        System.out.println("the result is "+result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero condition pls give a valid no. ");
           // e.printStackTrace();
        }

        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");

    }
}

// try-catch block