import java.util.Scanner;
public class StringExaample {
    public static void main(String[] args) {
        
        String name;

        System.out.println("enter ur name");
        Scanner sc=new Scanner(System.in);

        // name=sc.next();//only one word
        name=sc.nextLine();//whole sentence

        System.out.println("your name is \n"+name);
    }
}