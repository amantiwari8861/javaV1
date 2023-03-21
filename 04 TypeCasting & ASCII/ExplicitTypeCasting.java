import java.util.Scanner;

public class ExplicitTypeCasting 
{
    public static void main(String[] args) 
    {
        float f=56.8999f;
        int num;
        // num=f;//lossy conversion from float to int
        num=(int)f; //explicit typecasting (downward casting)
        System.out.println(num);

        // Scanner sc=new Scanner(System.in);

        // int num2=sc.nextFloat();// lossy conversion from float to int
        // int num2=(int)sc.nextFloat();//explicit typecasting
        // System.out.println(num2);
        
    }
}
