import java.util.Scanner;
public class BooleanDemo {

    public static void main(String[] args) {
        
        boolean isAlive;
        System.out.println("He is Alive or not ");
        Scanner sc=new Scanner(System.in);

        isAlive=sc.nextBoolean();

        System.out.println("the answer is :"+isAlive);
        
        // if (isAlive) 
        // {
        //     System.out.println("he is alive ");
        // }
        // else
        // {
        //     System.out.println("he is not alive");
        // }
    }
}