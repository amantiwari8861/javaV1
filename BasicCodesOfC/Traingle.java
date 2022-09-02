import java.util.Scanner;

public class Traingle {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 3 sides :");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();

        if (side1 == side2 &&  side2==side3 && side3==side1) 
        {
            System.out.println("Equilateral tri");
        }
        else if(side1 == side2 || side2==side3 || side3==side1)
        {
            System.out.println("isosceles tri");
        }
        else{
            System.out.println("scalen tri");
        }
    }
}