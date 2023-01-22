import java.util.Scanner;

public class Loops2
{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        for(int i=0;i<q;i++)
        {
            int sum=0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if(q>=0 && q<=500 && a>=0 && a<=50 && b>=0 && b<=50 && n>=1 && n<=15 )
            {
                for (int j = 0; j < n; j++) 
                {
                    if(j==0)
                    sum=sum+(int)(a+Math.pow(2,j)*b);
                    else
                    sum=sum+(int)(Math.pow(2,j)*b);
                    
                    System.out.print(sum+" ");  
                }       
            }  
            System.out.println();   

        }
        in.close();
    }
}
