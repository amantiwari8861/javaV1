import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        //Scanner class
        Scanner inputTaker = new Scanner(System.in);
        //Input
        // System.out.print("Enter a byte number : ");
        byte b = inputTaker.nextByte();
        System.out.print("Enter a short number : ");
        short s = inputTaker.nextShort();
        System.out.print("Enter a int number : ");
        int i = inputTaker.nextInt();
        System.out.print("Enter a long number : ");
        long l = inputTaker.nextLong();
        System.out.print("Enter a float number : ");
        float f = inputTaker.nextFloat();
        System.out.print("Enter a double number : ");
        double d = inputTaker.nextDouble();
        System.out.print("Enter a boolean : ");
        boolean b1 = inputTaker.nextBoolean();
        System.out.println("Enter a string(word) : ");
        String str = inputTaker.next();
        System.out.print("Enter a char : ");
        char c = inputTaker.next().charAt(0);
        System.out.println("Enter a string(sentence) : ");
        String str1 = inputTaker.nextLine();



        // System.out.println(b);
        // System.out.println(" b = " + b +" (8bit -> 1byte)");

        // int num=1;
        // while (num<=10) 
        // {
        //     System.out.println("num = " + num);
        //     num++;
        // }

        // do {
        //     System.out.println("num = " + num);
        //     num++;
        // } while (num>=10);

    }
}
