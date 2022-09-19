import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        //19 -> 10011
        //23 -> 10111
    // 19&23 -> 10011  => 19


        // Bitwise and (&)
        // System.out.println(Integer.toBinaryString(19));
        // System.out.println(Integer.toBinaryString(23));
        // System.out.println(19&23);
        // System.out.println(Integer.toBinaryString(19&23));

        // System.out.println(16<<1);//left Shift 16 << 1 => 16 * 2 =32
        // System.out.println(16<<2);//left Shift 16<<2  => 16 * 2* 2
        // System.out.println(16<<3);//left Shift

        //Right Shift
        // System.out.println(128>>1);// 128 * 1/2 
        // System.out.println(128>>2);// 128 * 1/2 * 1/2
        // System.out.println(128>>3);// 128 * 1/2 * 1/2 * 1/2


        // if

        Scanner sc=new Scanner(System.in);

        // System.out.println("Enter ur age ");
        // int age=sc.nextInt();

        // if (age >= 18) //true block
        // {
        //     System.out.println("u r eligible to vote");
        // }

        // if else
        // if (age >= 18) //true block
        // {
        //     System.out.println("u r eligible to vote");
        // }
        // else
        // {
        //     System.out.println("not eligible to vote");
        // }

        System.out.println("Enter ur marks");
        int marks=sc.nextInt();
        if (marks >= 90 && marks<=100)
        {
            System.out.println("got admission in DU");
        }
        else if(marks>=80 && marks<90)
        {
            System.out.println("got admission in IPU");
        }
        else if(marks>=70 && marks<=50)
        {
            System.out.println("Amity");
        }
        sc.close();
    }
}
