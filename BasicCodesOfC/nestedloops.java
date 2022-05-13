import java.util.Scanner;

public class nestedloops {
    public static void main(String[] args) {
        
        /* while (true) 
        {
            System.out.println("hello");
            break;
        } */

        /* for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        } *//* 
        for (int i = 0; i < 5; i++) {
            for(int j=4; j>i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        } */
        System.out.println("enter the rows");
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        /* for (int row = 0; row < lines; row++) 
        {
            for (int space = lines; space >row; space--) 
            {
                System.out.print("@");
            }
            for (int star = 0; star <= row; star++)
            {
                System.out.print("*");
            }
            System.out.println();
        } */
     /*    for (int row = 0; row < lines; row++) 
        {
            for (int space = 0; space <row; space++) 
            {
                System.out.print(" ");
            }
            for (int star = lines; star >row; star--)
            {
                System.out.print("*");
            }
            System.out.println();
        } */

    }
}