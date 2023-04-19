import java.util.Scanner;

class CalculatorPro
{
    
    double add(double arr[])
    {
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    double volOfSphere(double r)
    {
        // System.out.println(Math.PI);
        return 4.0/3.0*Math.PI*r*r*r;
    }

}

public class ScientificCalc {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        double num[];
        System.out.println("Enter the total size of numbers");
        num=new double[sc.nextInt()];

        System.out.println("enter data :");
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextDouble();
        }

        CalculatorPro c=new CalculatorPro();
        double sum=c.add(num);
        System.out.println("the sum is "+sum);

        // System.out.println("Enter radius :");
        // double radius=sc.nextDouble();
        // System.out.println(c.volOfSphere(radius));
        sc.close();
    }
}