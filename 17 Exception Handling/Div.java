import java.util.InputMismatchException;
import java.util.Scanner;
class Div {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.println("enter 2 values to divide ");
        try
        {
            // int num1 = sc.nextInt();
            // int num2 = sc.nextInt();
            // result = num1 / num2;// exception occur at this line
            // int arr[]=new int[]{10,20};
            // System.out.println(arr[4]);
            throw new UnsupportedOperationException("chala ja bhai ..");
        }
        catch(ArithmeticException e)
        {
            System.out.println("pls do not divide by zero ");
            e.printStackTrace();
        }
        catch(InputMismatchException e)
        {
            System.out.println("pls input numbers only "+e.getLocalizedMessage());
        }
        // catch(Exception e)
        // {
        //     e.printStackTrace();
        // }
        finally
        {
            System.out.println("i will close sc object resources");
            sc.close();
        }
        System.out.println("the result is :" + result);
        System.out.println("if exception occur this will never executed");
        System.out.println("if exception occur this will never executed");
        System.out.println("if exception occur this will never executed");
        System.out.println("if exception occur this will never executed");
    }
}
// try catch finally throw throws
// Object class is superclass of all the classes