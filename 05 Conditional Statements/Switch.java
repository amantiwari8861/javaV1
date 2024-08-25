import java.util.Scanner;

public class Switch {

    public static void main(String[] args) 
{
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
        // case '$':System.out.println("the character is $ ");
        // break;
        // case '@':System.out.println("the character is @ ");
        // break;
        // case '!':System.out.println("the character is ! ");
        // break;
        // case '*':System.out.println("the character is * ");
        // break;
        // default:System.out.println("invalid character");
        // break;
        // }

        // System.out.println(
        //         "\nGreet Aman" +
        //         "\nGreet Mohit" +
        //         "\nGreet Eklavya" +
        //         "\nGreet Khushi" +
        //         "\nGreet Krishna\n");
        // System.out.print("enter ur name :");
        // String name = sc.next().toLowerCase();

        // switch (name) 
        // {
        //     case "aman":
        //         System.out.println("Good Morning Aman Sir!!");
        //         break;
        //     case "mohit":
        //         System.out.println("Good Morning Mohit!!");
        //         break;
        //     case "eklavya":
        //         System.out.println("Good Morning Eklavya!!");
        //         break;
        //     case "deepak":
        //         System.out.println("Good Morning Deepak!!");
        //         break;
        //     case "khushi":
        //         System.out.println("Good Morning Khushi!!");
        //         break;
        //     case "krishna":
        //         System.out.println("Good Morning Krishna!!");
        //         break;
        //     default:
        //         System.out.println("invalid name!!");
        //         break;
        // }

        //JDK 14
        // System.out.println("Enter choices :");
        // int choice=sc.nextInt();
        // switch (choice) {
        //     case 100,101,102,103,104:
        //         System.out.println("great choice");
        //         break;
        
        //     default:System.out.println("invalid choice");
        //         break;
        // }
        // String action=null;
        // System.out.println("Enter error code :");
        // int errCode=sc.nextInt();
        // int problemLevel= switch (errCode) 
        // {
        //     case 100,201,501,600:
        //         yield 1;
        //     case 301,801,605:
        //         yield 2;
        //     default: yield -1;
        // };


        // int problemLevel= switch (errCode) 
        // {
        //     case 100,201,501,600 -> 1;
        //     case 301,801,605 -> 2;
        //     default -> -1;
        // };
        // int problemLevel2= switch (errCode) 
        // {
        //     case 100,201,501,600 -> 1;
        //     case 301,801,605 -> {
        //         action="no action";
        //         yield 2;
        //     }
        //     default -> -1;
        // };
        // switch(errCode)
        // {
        //     case 189,975,35->{
        //         System.out.println("do not perform action");
        //         // yield 1; // error
        //     }
        //     default ->{
        //         System.out.println("good job");
        //     }
        // }
        // System.out.println("The problem level is "+problemLevel);
        // System.out.println("The action status is "+action);
        boolean xIsVowel = true;

        char ch = 'X';
        boolean isVowel = switch(ch) {
        case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
        case 'x', 'X' -> { if(xIsVowel) yield true; else yield false; }
        default -> false;
        };
        if(isVowel) 
            System.out.println(ch + " is a vowel.");
        sc.close();
}
}