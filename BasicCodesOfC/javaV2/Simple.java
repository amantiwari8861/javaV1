import java.util.Scanner;
public class Simple {
    public static void main(String[] args) {
        
       /* System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");*/

        Scanner sc=new Scanner(System.in);
        float p,r,t,result;
        System.out.println("enter p,r and t");

        p=sc.nextFloat();
        r=sc.nextFloat();
        t=sc.nextFloat();

        result= p*r*t/100;

        System.out.println("Simple Interest :"+result);
    }
}