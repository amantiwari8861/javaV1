import java.util.Scanner;

public class UserAdd {
    public static void main(String[] args) {

        int num1, num2, sum;

        Scanner input = new Scanner(System.in);
        System.out.println("enter the 1st number :");
        num1 = input.nextInt();
        System.out.println("enter the 2nd number :");
        num2 = input.nextInt();
        sum=num1+num2;
        System.out.println("the sum is "+sum);
        input.close();
    }
}