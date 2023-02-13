import java.util.Scanner;

public class VolOfSphere {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        float r,pi=3.14f,result;
        System.out.println("enter the r :");
        r=sc.nextFloat();//let r=2.5

        // result=4/3*pi*r*r*r;// here result is wrong 49.0625
        result=4.0f/3.0f*pi*r*r*r;
        // result=(float)(4.0/3.0*pi*r*r*r);

        System.out.println("the volume is "+result);
        sc.close();

        // what is 4/3 -> 1.33333
        // what if we treat 1.333 as int ?
        // Ans. it will become 1 
    }
}