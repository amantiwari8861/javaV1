import java.util.Scanner;

public class BuiltInFunctions {
    public static void main(String[] args) 
    {

        // A method(function) in Java is a block of code that, when called, performs
        // specific actions mentioned in it.

        Scanner sc = new Scanner(System.in);
        int choice;
        double num1, num2, result = 0;
        System.out.println(
                        "1.Addition \n" +
                        "2.Subtraction\n" +
                        "3.Multiplication\n" +
                        "4.Division");
        System.out.print("Enter ur choice:");
        choice = sc.nextInt();
        System.out.println("Enter 2 Numbers");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();

        Calculator calc = new Calculator();// instantiation : the process of making object.
        switch (choice) {
            case 1:
                result = calc.add(num1, num2);
                break;

            case 2:
                result = calc.subtraction(num1, num2);
                break;

            case 3:
                result = calc.multiply(num1, num2);
                break;

            case 4:
                result = calc.divide(num1, num2);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("The result is " + result);
        sc.close();
    }
}

class Calculator 
{
    String companyName = "Casio";
    double price = 500;

    double add(double num1, double num2) 
    {
        double sum = num1 + num2;
        System.out.println("Adding Method");

        return sum;
    }

    double multiply(double num1, double num2) {
        double sum = num1 * num2;
        System.out.println("Multiply Method");

        return sum;
    }

    double divide(double num1, double num2) {
        double sum = num1 / num2;
        System.out.println("divide Method");

        return sum;
    }

    double subtraction(double num1, double num2) {
        double sum = num1 - num2;
        System.out.println("Subtraction Method");
        return sum;
    }
}