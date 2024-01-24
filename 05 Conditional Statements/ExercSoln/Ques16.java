import java.util.Scanner;

public class Ques16 {

    public static void main(String[] args) 
    {
        
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the character:");
        ch=sc.next().charAt(0);// "Aman"

        if (ch>=65 && ch<=90 || ch>=97 && ch<=122) 
        {
            System.out.println(ch+" is Alphabet");
        }
        else if(ch>=48 && ch<=57)
        {
            System.out.println(ch+" is Digit");
        }
        else
        {
            System.out.println(ch+" is Special character");
        }

    }
}