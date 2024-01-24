import java.util.Scanner;

public class Ques9 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        double x,y;
        System.out.println("enter x,y");
        x=sc.nextDouble();
        y=sc.nextDouble();

        if (x>0 && y>0) 
        {
            System.out.println("lies in Ist quadrant ");
        }
        else if (x<0 && y>0) 
        {
            System.out.println("lies in IInd quadrant ");
        }
        else if (x<0 && y<0) 
        {
            System.out.println("lies in IIIrd quadrant ");
        }
        else if (x>0 && y<0) 
        {
            System.out.println("lies in IVth quadrant ");
        }
        else
        {
            System.out.println("lies on origin or line");
        }
    }
}