import java.util.Scanner;

public class GQ15 
{
    public static void main(String[] args) {
        

        // gcd of 1071 and 462
        // int num1=1071,num2=18,temp=0;
        // for (int i = 2; i <num2 ; i++) 
        // {
        //     while (num2%i==0) 
        //     {
        //         System.out.print(i+" X ");
        //         num2=num2/i;
        //     }
        // }

        //Normal mathematical method:
        // 48 = 2 * 2 * 2 * 2 *3 
        // 18 = 2 * 3 * 3
        // 48 gcd 18 = 6 Ans.

        //Euclidian Algo For GCD :
        
        Scanner sc=new Scanner(System.in);
        int q,a,b,r,min,max;
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
        System.out.println("The GCD is :"+max);

        /*
         *          PSUEDOCODE
         * 
         * Step 1: max=48 ,min=18
         *          18!=0  True
         *      q=48/18 => 2.66 => 2
         *      r=48 % 18 => 12
         *      
         *      // 2*18+12  => 48
         *      max=18
         *      min=12
         * 
         * Step 2: max=18,min=12
         *          12!=0 True
         *          q=18/12 => 1.5 => 1
         *          r= 18 % 12  => 6
         * 
         *          //1*12+6 => 18
         * 
         *          max=12
         *          min=6
         * 
         * Step 3: max=12 ,min=6
         *      6!=0 True
         *      q=12/6 => 2
         *      r=12%6 => 0
         * 
         *      //2*6+0 => 12
         * 
         *      max=6
         *      min=0
         * 
         * Step 4 : max=6,min=0
         *          0!=0 False 
         *          loop terminated!
         * 
         *      i.e max=6 is the Answer or GCD of 48,18
         */
    }
}