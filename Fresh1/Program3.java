import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter ur age ");
        int age=obj.nextInt();
        if (age>=18 && age<=150) {
            System.out.println("Ready to vote !"); 
        }
        else
        {
            System.out.println("not ready to vote !");
        }
    }
}