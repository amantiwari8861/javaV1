import java.util.Scanner;
public class UserAdd {
    public static void main(String[] args) {

        int num1, num2, sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number :");
        num1 = sc.nextInt();
        System.out.println("enter the 2nd number :");
        num2 = sc.nextInt();
        sum=num1+num2;
        System.out.println("the sum is "+sum);

        //or
        
        // System.out.println("enter 2 numbers :");
        // num1 = sc.nextInt();
        // num2 = sc.nextInt();
        // sum=num1+num2;
        // System.out.println("the sum is "+sum);
        
        sc.close();
    }
}