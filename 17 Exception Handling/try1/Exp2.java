import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp2 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num=0,num2=0,result=0;
        try 
        {
            System.out.print("Enter number 1 :");
            num=sc.nextInt();
            System.out.print("Enter number 2 :");
            num2=sc.nextInt();

            if (num<0 || num2<0) 
            {
                throw new Exception("negative no. se divide krna allowed nahi hai");
            }
            result=num/num2;
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("pls enter a valid input");
            // e.printStackTrace();
        }
        catch (ArithmeticException ae)
        {
            System.out.println("pls do not divide by zero");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            sc.close();
            System.out.println("scanner is closed");
        }

        System.out.println("The result is :"+result);
    }
}