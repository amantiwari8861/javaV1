import java.util.Scanner;

public class VGQ16 {

    public static void main(String[] args) {
        
        // LCM(a,b)×GCD(a,b)=∣a×b∣
        // LCM(a,b)=|a*b| / GCD(a,b)
        

        Scanner sc=new Scanner(System.in);
        int q,a,b,r,min,max,lcm;
        System.out.println("Enter two numbers :");
        a=sc.nextInt();//18
        b=sc.nextInt();//48

        max=(a>b)?a:b;//48
        min=(a<b)?a:b;//18

        while(min!=0) 
        {
            q=max/min;
            r=max%min;
            max=min;
            min=r;
        }
        System.out.println("The GCD(HCF) is :"+max);

        lcm=Math.abs(a*b)/max;

        System.out.println("LCM is :"+lcm);

    }
}