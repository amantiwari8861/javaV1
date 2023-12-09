import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int choice;
        // System.out.println(
        // "\n1.Greet Aman" +
        // "\n2.Greet Mohit" +
        // "\n3.Greet Eklavya" +
        // "\n4.Greet Khushi" +
        // "\n5.Greet Krishna\n");
        // System.out.print("Enter choice:");
        // choice = sc.nextInt();

        // switch (choice) {
        // case 1:
        // System.out.println("Good Morning Aman Sir!!");
        // break;
        // case 2:
        // System.out.println("Good Morning Mohit!!");
        // break;

        // case 3:
        // System.out.println("Good Morning Eklavya!!");
        // break;

        // case 65:
        // System.out.println("Good Morning Deepak!!");
        // break;
        // case 4:
        // System.out.println("Good Morning Khushi!!");
        // break;

        // case 5:
        // System.out.println("Good Morning Krishna!!");
        // break;

        // default:
        // System.out.println("invalid choice!!");
        // break;
        // }

        // System.out.print("enter character :");
        // char choice=sc.next().charAt(0);

        // switch(choice)
        // {
        // case 'A' :System.out.println("Hello aman sir!!");
        // break;
        // case '$':System.out.println("Hello $ sir!!");
        // break;
        // case '@':System.out.println("Hello @ sir!!");
        // break;
        // case '!':System.out.println("Hello ! sir!!");
        // break;
        // case '*':System.out.println("Hello * sir!!");
        // break;
        // default:System.out.println("invalid character");
        // break;
        // }

        System.out.println(
                "\nGreet Aman" +
                "\nGreet Mohit" +
                "\nGreet Eklavya" +
                "\nGreet Khushi" +
                "\nGreet Krishna\n");
        System.out.print("enter ur name :");
        String name = sc.next().toLowerCase();

        switch (name) 
        {
            case "aman":
                System.out.println("Good Morning Aman Sir!!");
                break;
            case "mohit":
                System.out.println("Good Morning Mohit!!");
                break;
            case "eklavya":
                System.out.println("Good Morning Eklavya!!");
                break;
            case "deepak":
                System.out.println("Good Morning Deepak!!");
                break;
            case "khushi":
                System.out.println("Good Morning Khushi!!");
                break;
            case "krishna":
                System.out.println("Good Morning Krishna!!");
                break;
            default:
                System.out.println("invalid name!!");
                break;
        }
        sc.close();
    }
}