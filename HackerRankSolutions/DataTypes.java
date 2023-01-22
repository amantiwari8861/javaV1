import java.util.Scanner;

public class DataTypes
{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        // short -> 2byte -> 16 bit
        //-2^n-1 to 2^n-1 -1

        for(int i=0;i<t;i++)
        {
            
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println("* int");
                if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long");
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}



