import java.util.Scanner;

class Calculator
{
    String companyName="CASIO";
    double piValue=3.14;
    
    //no argument no return type
    void showCompanyName()
    {
        System.out.println("Company Name :"+companyName);
    }
    //no argument with return type
    double getPiValueUsed()
    {
        return piValue;
    }

    //with argument no return type
    void printVolumeOfSphere(double r)
    {
        double vol=4.0/3.0*piValue*r*r*r;
        System.out.println("Volume of Sphere is :"+vol);
    }

    //with argument and return type
    double square(double num)
    {
        return num*num;
    }

    double powerWalaFxn(double num,double pow)
    {
        double res=1;
        //2^8 => 2*2*...
        for (int i = 1; i <= pow; i++) 
        {
            res=res*num;
        }
        return res;
    }
}
public class Functions {

    public static void main(String[] args) {
 
        //pre-defined
        // System.out.println(Math.pow(2.5, 2));
        // System.out.println(Math.sqrt(2));//1.414
        // System.out.println(Math.sqrt(625));
        // System.out.println(Math.PI);

        //user-defined

        Calculator calc=new Calculator();
        // //no argument no return type
        // calc.showCompanyName();

        // //no argument with return type
        // double pi=calc.getPiValueUsed();
        // System.out.println("The pi value used is :"+pi);
        // System.out.println(calc.getPiValueUsed());

        // //with argument no return type
        // calc.printVolumeOfSphere(2.5);

        // //with argument and return type
        // double a=2,b=3,result;
        // result=calc.square(a)+calc.square(b)+2*a*b;
        // System.out.println("The (a+b)^2 = "+result);

        // double num=2,pow=8,result2;
        // result2=calc.powerWalaFxn(num,pow);
        // System.out.println("The result2 is :"+result2);

        System.out.println(calc.powerWalaFxn(3, 4.5));
        // System.out.println(calc.powerWalaFxn(2, 5));
        // System.out.println(calc.powerWalaFxn(7, 2));
        // System.out.println(calc.powerWalaFxn(4, 6));

        Scanner sc=new Scanner(System.in);

        double n,p;
        System.out.print("Enter num :");
        n=sc.nextDouble();
        System.out.print("Enter power :");
        p=sc.nextDouble();
        System.out.println("The result is :"+calc.powerWalaFxn(n,p));
        
        // System.out.println(calc.powerWalaFxn(sc.nextDouble(), sc.nextDouble()));
        sc.close();
    }
}