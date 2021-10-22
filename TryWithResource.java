import java.util.InputMismatchException;
import java.util.Scanner;
public class TryWithResource {
    public static void main(String[] args) {
        
      try (Scanner sc=new Scanner(System.in)) 
      {
        System.out.println("Enter 2 numbers:");
        int num1=objScanner.nextInt();
        int num2=objScanner.nextInt();

        int result=num1/num2;
        System.out.println("the result is : "+result);

      } catch (ArithmeticException | InputMismatchException e) 
      {
        System.out.println("Handeled both Exception");
      }
    }
}