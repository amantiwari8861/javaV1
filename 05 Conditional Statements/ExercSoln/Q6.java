import java.util.Scanner;

public class Q6 {

    public static void main(String args[] )
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of m");
        int m=sc.nextInt();

        int n;
        if (m>0) {
            n=1;
        }
        else if(m<0)
        {
            n=-1;
        }
        else 
        {
            n=0;
        }

        System.out.println(" N = "+n);
        sc.close();

    }
}