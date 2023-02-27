import java.util.Scanner;
class Div {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        System.out.println("enter 2 values to divide ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        result = num1 / num2;// exception occur at this line
        System.out.println("the result is :" + result);
        System.out.println("if exception occur this will never executed");
        System.out.println("if exception occur this will never executed");
        System.out.println("if exception occur this will never executed");
        System.out.println("if exception occur this will never executed");
        sc.close();
    }
}
// try catch finally throw throws
// Object class is superclass of all the classes