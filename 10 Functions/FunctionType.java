import java.util.Scanner;

class Calculator
{
    Scanner sc=new Scanner(System.in);
    //type 1 : no argument no return type
    void showPurpose(/*arguments*/)
    {
        System.out.println("Our purpose is to calculate Something");
        /*returns from here*/
    }
    //type 2 : no argument with return type
    float getPie()
    {
        System.out.println("giving pie value");
        return 3.14f;
    }
    //type 3 : with argument no return type
    void add(float num1,float num2)
    {
        float sum=num1+num2;
        System.out.println("The sum is "+sum);
    }

    //type 4 : with argument and return type
    float getSquare(float num)
    {
        return num*num;
    }
}


public class FunctionType 
{
    public static void main(String[] args) 
    {
        Calculator c=new Calculator();

        //Type 1
        c.showPurpose();

        //Type 2 : no argument with return type
        float pi=c.getPie();
        System.out.println(" PI ="+pi);

        //Type 3
        c.add(12.5f, 3.7f);

        //Type 4
        float sq=c.getSquare(5.0f);
        System.out.println(sq);

        //vol of cylinder = pi*r*r*h
        float r=2.5f,h=3.2f;
        float result=c.getPie()*c.getSquare(r)*h;
        System.out.println("Volume of cylinder ="+result);
        
    }
}