import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        // int age;
        // System.out.print("Enter ur age :");
        // age=sc.nextInt();
        // if(age>=18)
        // {
        //     System.out.println("Ready to vote!!");
        // }
        // else
        // {
        //     System.out.println("Not ready to vote");
        // }

        double percentage;
        System.out.print("Enter ur percentage:");
        percentage=sc.nextDouble();

        if(percentage>=90)
        {
            System.out.println("Got admission in DU");
            if(percentage>=98)
            {
                System.out.println("got CS branch");
                if(percentage==100)
                {
                    System.out.println("got scholarship of 1.5 Lac");
                }
            }
            else if(percentage>=95)
            {
                System.out.println("got electronics branch");
            }
            // else
            // {
            //     System.out.println("got Mechanical Branch");
            // }
        }
        else if(percentage>=80)
        {
            System.out.println("IPU");
        }
        else if(percentage>=70)
        {
            System.out.println("Amity");
        }
        else if(percentage>=60)
        {
            System.out.println("CCS");
        }
        else if(percentage>=33)
        {
            System.out.println("Private University");
        }
        else
        {
            System.out.println("Chai becho");
        }
        


        sc.close();
    }
}