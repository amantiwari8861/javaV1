//difference between next() and nextLine()
import java.util.Scanner;
class StringBasics
{
    public static void main(String[] args) {
        // to take user input in java we use some functions 
        // 8 data type and one String class
        Scanner sc=new Scanner(System.in); //pre-defined 

        // System.out.println("Enter a letter");
        // char ch=sc.next().charAt(0);
        // System.out.println("you given "+ch+" character");

        // System.out.println("enter first name ");
        // String fname=sc.next(); //next() is used to take a word from user
        // System.out.println("the name is "+fname);

        // System.out.println("Enter full name ");
        // String fullName=sc.nextLine();//take full sentence from user
        // System.out.println("the full name is "+fullName);

        sc.close();
    }
}