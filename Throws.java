import java.util.InputMismatchException;
import java.util.Scanner;
public class Throws 
{
    public static void main(String[] args) 
    {
        inputHandler();
    }
    static void inputHandler()
    {
        try {
            arithematicHandler();
        } catch (InputMismatchException e) {
            // e.printStackTrace();
            System.out.println("input mismatched please give only int ");
        }
    }
    static void arithematicHandler()
    {
        try {
            operation();
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println("arithematic exception handled please do not divide by zero ");
        } 
    }
    static void operation() throws ArithmeticException,InputMismatchException
    {
        Scanner objScanner=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1=objScanner.nextInt();
        int num2=objScanner.nextInt();

        int result=num1/num2;
        System.out.println("the result is : "+result);
        objScanner.close();
    }
}
