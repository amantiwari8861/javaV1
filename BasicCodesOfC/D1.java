import java.util.Scanner;

public class D1 {
    public static void main(String[] args) 
    {
        
        int inp;
        Scanner sc=new Scanner(System.in);

        System.out.println("input num:");
        inp=sc.nextInt();

        if (inp==1) {
            System.out.println("Ready!");
        }
        else if(inp==2)
        {
            System.out.println("Go");
        }
        else
        {
            System.out.println("Go Home");
        }
    }
}