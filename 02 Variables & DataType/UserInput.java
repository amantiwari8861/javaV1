import java.lang.*; //by default imported
import java.util.Scanner;

public class UserInput 
{
    public static void main(String[] args) {
        //Scanner class
        Scanner sc = new Scanner(System.in);
        //Input
        System.out.print("Enter a byte number : ");
        byte b = sc.nextByte();
        System.out.print("Enter a short number : ");
        short s = sc.nextShort();
        System.out.print("Enter a int number : ");
        int i = sc.nextInt();
        System.out.print("Enter a long number : ");
        long l = sc.nextLong();
        System.out.print("Enter a float number : ");
        float f = sc.nextFloat();
        System.out.print("Enter a double number : ");
        double d = sc.nextDouble();
        System.out.print("Enter a boolean : ");
        boolean b1 = sc.nextBoolean();
        
        System.out.println("The Stored data in variable is :");
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b1);
        sc.close();
    }
}
