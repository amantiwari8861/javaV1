import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur name:");
        // char name=sc.next().charAt(0); //one letter
        // String name=sc.next(); //one word
        String name = sc.nextLine(); // one sentence
        switch (name) {
            case "Aman":
                System.out.println("Hello " + name + " Sir!");
                break;
            case "Piyush":
                System.out.println("Hello BCA student " + name);
                break;
            case "aditya":
                System.out.println("Hello BCA 6th sem student " + name);
                break;
            case "ishant":
                System.out.println("Hello BCA 4th sem student " + name);
                break;
            default:
                System.out.println("case not defined with this name");
                break;
        }

        sc.close();
    }
}