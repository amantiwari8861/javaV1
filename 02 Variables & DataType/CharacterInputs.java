import java.util.Scanner;
public class CharacterInputs {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        // System.out.println("Enter a string(word) : ");
        // String str = sc.next();

        // System.out.println("Given word is :"+str);

        System.out.print("Enter a char : ");
        char c = sc.next().charAt(0);
        System.out.println(c);
		
        // // sc.nextLine();// if character skips use this
        // System.out.println("Enter a string(sentence) : ");
        // String str1 = sc.nextLine();
        // System.out.println("Given Sentence :"+str1);
    }
}
//H.w take a users name by keyboard and Say Thanks to him/her .
//    take user's name,city,address,pincode,mobileno and salary from keyboard and print their Details