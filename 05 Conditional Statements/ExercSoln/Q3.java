import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter number :");
        num=sc.nextInt();
        
        if (num>0) 
        {
            System.out.println("+ve number");
        }
        else if(num<0)
        {
            System.out.println("-ve number");
        }
        else
        {
            System.out.println("zero");
        }
    }
}