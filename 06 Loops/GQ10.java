import java.math.BigInteger;
import java.util.Scanner;

public class GQ10 {

    public static void main(String[] args) {
        
        long digitLength=0,rem,sumEven=0,sumOdd=0,number,t1,t2,t3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        number=sc.nextLong();

        // 153 % 10 = 3

        // 153 / 10 = 15.3 => 15
        // 15 / 10 => 1.5 -> 1
        // 1 /10 => 0.1 -> 0
        long tempnum=number;

        while (tempnum>0) 
        {
            tempnum=tempnum/10;
            digitLength++;
        }
        System.out.println("The length of digit is :"+digitLength);

        //1252
        while (number>0) 
        {
            rem=number%10;
            if (rem%2==0) 
            {
                sumEven=sumEven+rem;
            }
            else
            {
                sumOdd=sumOdd+rem;
            }
            number=number/10;
        }

        System.out.println("Sum of even Digits :"+sumEven);
        System.out.println("Sum of Odd Digits :"+sumOdd);

        // fibonnaci series
        t1=sumOdd;
        t2=sumEven;
        System.out.print("Fibonnaci Series :"+t1+"  "+t2+"  ");
        for (int i = 1; i <= digitLength-2; i++) 
        {
            t3=t1+t2;
            System.out.print(t3+"  ");   
            t1=t2;
            t2=t3;
        }
        sc.close();
    }
}