import java.util.Scanner;

public class GQ1 
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();

        int fact=1;
        for(int i=num;i>0;i--)
        {
            fact=fact*i;
            System.out.print(i+" X ");
        }
        // System.out.println("="+fact);
        System.out.println("\b\b="+fact);
        // System.out.println("The factorial of "+num+" is "+fact);
        sc.close();
    }
}
