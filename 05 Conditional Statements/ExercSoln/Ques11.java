import java.util.Scanner;

public class Ques11 {

    public static void main(String[] args) {

        double a, b, c, posResult, negResult;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        posResult = (-b + Math.sqrt(b * b - 4.0 * a * c)) / 2.0 * a;
        negResult = (-b - Math.sqrt(b * b - 4.0 * a * c)) / 2.0 * a;

        System.out.println("Positive Result :" + posResult);
        System.out.println("Negative Result :" + negResult);

        if (posResult > 0 && negResult > 0) 
        {
            System.out.println("Real");
        } 
        else if (posResult < 0 && negResult < 0) 
        {
            System.out.println("Imaginary");
        } 
        else 
        {
            System.out.println("Complex");
        }
    }
}