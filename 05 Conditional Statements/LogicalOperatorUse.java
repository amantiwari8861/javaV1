import java.util.Scanner;

public class LogicalOperatorUse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        // double percentage;
        // System.out.print("Enter percentage :");
        // percentage=sc.nextDouble();
        System.out.print("Enter ur surname:");
        String surname=sc.next();
        // 90 - 100 
        // if(percentage>=90 && percentage<=100 && surname.equals("tiwari"))
        // {
        //     System.out.println("DU");
        // }

        
        System.out.print("Enter num:");
        int num=sc.nextInt();//24

        // if(num==1||num==3||num==5)
        // {
        //     System.out.println("Odd");
        // }

        // if(!(num>=18))
        // {
        //     System.out.println("not ready to vote");
        // }
        // else
        // {
        //     System.out.println("Ready to vote");
        // }

        if((num==1 || num==3 || num== 10) && surname.equals("tiwari") )
        {
            System.out.println("Hello !!");
        }
        sc.close();
    }
}