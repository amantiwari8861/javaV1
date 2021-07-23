import java.util.Scanner;

class Div
{

    public static void main(String[] args) {
        //
        Scanner sc=new Scanner(System.in);
        int result=0;
        System.out.println("enter 2 values to divide ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
try{
       result=num1/num2;//exception occur at this line 
}
catch(ArithmeticException obj)
{
    System.out.println("pls give number greater than zero");
}
        System.out.println("if exception occur this will never executed");
        System.out.println("if exception occur this will never executed");
        System.out.println("if exception occur this will never executed");
        System.out.println("if exception occur this will never executed");
        System.out.println("if exception occur this will never executed");
        System.out.println("the result is :"+result);
        Div Divobj=new Div();

    
    System.out.println(Divobj instanceof Div);//true
    System.out.println(Divobj instanceof Object);

        sc.close();
    }
}
//try catch finally throw throws
//Object class is superclass of all the classes