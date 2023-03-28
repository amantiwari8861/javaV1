import java.util.Scanner;

public class Q11 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        // double num=sc.nextDouble();
        // double d=Math.sqrt(num);
        // System.out.println(d);

    //  root of quadratic Eqn=  ( -b +root(b*b-4*a*c))/2*a
        double a,b,c,posResult,negResult;
        System.out.println("Enter a,b,c");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();

        posResult= (-b + Math.sqrt((b*b-4.0*a*c)))/(2*a);
        negResult= (-b - Math.sqrt((b*b-4.0*a*c)))/(2*a);

        System.out.println("Positive Result :"+posResult);
        System.out.println("Negative Result :"+negResult);


        if (posResult>0 && negResult>0) 
        {
            System.out.println("Real number");    
        }
        else if(posResult<0 && negResult<0)
        {
            System.out.println("Imaginary no");
        }
        else
        {
            System.out.println("Complex no. or no solution");
        }
        sc.close();
    }
}
