import java.util.Scanner;
public class Programs1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        // sc is a reference variable which is containing the reference of Scanner Class
        
        // by using scanner class object we r able to call the pre-defined methods of Scanner Class
        //like   next(); nextInt(); ....
        int num1,num2,num3;
        System.out.println("Enter 2 values ");

        num1= sc.nextInt();
        num2=sc.nextInt();

        num3=num1+num2;
        System.out.println("the sum is "+num3);
    }
}