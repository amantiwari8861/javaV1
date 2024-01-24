import java.util.Scanner;

public class GQ10 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num==1 || num==2)
        {
            System.out.println("prime no.");
            return;
        }
        boolean isPrime=true;
       for (int i = 2; i < num; i++) 
       {
        //    System.out.println(num+"%"+i+"="+(num%i));
           if(num%i==0)
           {
               System.out.println("not a prime no.");
               isPrime=false;
               break;
            }
       }
       if (isPrime) 
       {
            System.out.println("prime no");
       }

    }
}