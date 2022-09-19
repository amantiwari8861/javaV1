import java.util.Scanner;

public class VolOfSphere {

    public static void main(String[] args) {
        
        Scanner b=new Scanner(System.in);

        // byte a=10,b2=20,c;
        // c=(byte) (a+b2);
        // System.out.println("the sum is "+c);

        // byte num1,num2,result;
        // System.out.println("Enter the num1 and num2");
        // num1=b.nextByte();
        // num2=b.nextByte();
        // result=(byte) (num1+num2);
        // System.out.println("result ="+result);
        // System.out.println("sum is "+(num1+num2));
        
        // float f1=10.5f,f2=78.67F,res;
        // res=f1+f2;
        // System.out.println(" result :"+res);
        
        // float f1,f2,res;
        // System.out.println("enter 2 values ");
        // f1=b.nextFloat();
        // f2=b.nextFloat();
        // res=(float)(f1+f2+56.8);
        // System.out.println(" result :"+res);

        // double d1,d2,result;

        // d1=7667547828.7784378;
        // // d2=9667547828.7784378;
        // System.out.println("Enter d2");
        // d2=b.nextDouble();

        // result=d1+d2;

        // System.out.println(result);
        // System.out.println("the result is "+result);

        float r,pi=3.14f,result;

        System.out.println("enter the r :");
        r=b.nextFloat();

        // result=(float)(4.0/3.0*pi*r*r*r);
        result=4.0f/3.0f*pi*r*r*r;

        System.out.println("the volume is "+result);





    }
}