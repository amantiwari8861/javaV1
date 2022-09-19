import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) 
    {
        
        // Every year that is exactly divisible by four is a leap year,
        //  except for years that are exactly divisible by 100,
        //   but these centurial years are leap years if they are exactly divisible by 400.
        //    For example, the years 1700, 1800, and 1900 are not leap years, but the years 1600 and 2000 are.

        int year;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the year:");
        year=sc.nextInt();

        if ((year%4 == 0 && year%100 != 0 )  || year%400 ==0 )
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
}