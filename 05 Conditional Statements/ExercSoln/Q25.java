import java.util.Scanner;

public class Q25 {

    public static void main(String[] args) {
        
        System.out.println("1.find area of triangle");
        System.out.println("2.find area of square");
        System.out.println("3.find area of circle");
        System.out.println("4.find area of cylinder");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur choice:");
        int choice=sc.nextInt();

        if (choice==1) 
        {
            double b,h,result;
            System.out.println("Enter base :");
            b=sc.nextDouble();
            System.out.println("Enter height :");
            h=sc.nextDouble();
            result=(1.0/2.0)*b*h;
            System.out.println("Area of triange is "+result);
        }
        else if(choice==2)
        {
            double side;
            System.out.println("enter side");
            side=sc.nextDouble();
            System.out.println("Area of square :"+side*side);
        }
        else if(choice==3)
        {

        }
        else if(choice==4)
        {

        }
        else 
        {
            System.out.println("Invalid choice");
        }

    }
}