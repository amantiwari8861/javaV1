import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        
        Scanner obj=new Scanner(System.in);

        System.out.println("enter the values ");
        int num= obj.nextInt();
        float f=obj.nextFloat();
        double d=obj.nextDouble();
        short s=obj.nextShort();
        byte b=obj.nextByte();
        boolean bool=obj.nextBoolean();
        String name=obj.next();  //take 1 word
        String fullname=obj.nextLine();  //takes a sentence 
        char ch=obj.next().charAt(0);  //to take character input by user

        float f2=3.14f;  // f/F is must
    }
}