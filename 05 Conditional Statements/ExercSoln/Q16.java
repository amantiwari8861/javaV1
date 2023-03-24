import java.util.Scanner;

public class Q16 
{
    public static void main(String[] args) 
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character :");
        ch=sc.next().charAt(0);

        if (ch>=65 && ch <=90) 
        {
            System.out.println("Capital Alphabet");
        }
        else if(ch>=97 && ch<=122)
        {
            System.out.println("Small Alphabet");
        }
        else if(ch>=48 && ch<=57)
        {
            System.out.println("Numeric");
        }
        else 
        {
            System.out.println("Special character or symbol");
        }
        sc.close();
    }
}