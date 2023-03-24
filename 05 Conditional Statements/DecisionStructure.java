import java.util.Scanner;

class DecisionStructure {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // int age;
        // System.out.print("enter age:");
        // age = sc.nextInt();

        // if (true block)
        // if(age>=18)
        // {
        // System.out.println("Ready to vote!");
        // }

        // if(age>=18)
        // {
        // System.out.println("Ready to vote!");
        // }
        // else
        // {
        // System.out.println("not ready to vote");
        // }

        // if(age>18)
        // {
        // System.out.println("Ready to vote!");
        // }
        // else if(age==18)
        // {
        // System.out.println("Congrats for first time vote!");
        // }
        // else
        // {
        // System.out.println("not ready to vote");
        // }

        // System.out.println("enter ur marks");
        // int marks = sc.nextInt();

        // if (marks >= 90 && marks <= 100) 
        // {
        //     System.out.println("Got Admission in DU");
        //     if (marks == 100) 
        //     {
        //         System.out.println("Scholarship of 1 Lac by Aman");
        //     }
        //     else if(marks>95)
        //     {
        //         System.out.println("got 50k scholarship");
        //     }
        //     else 
        //     {
        //         System.out.println("Better luck next time!");
        //     }
        // } 
        // else if (marks >= 80 && marks <= 90) 
        // {
        //     System.out.println("Got Admission in LPU");
        // } 
        // else if (marks >= 70 && marks <= 80) 
        // {
        //     System.out.println("Got Admission in IPU");
        // } 
        // else if (marks >= 50 && marks < 70) 
        // {
        //     System.out.println("Got Admission in Other university");
        // } 
        // else 
        // {
        //     System.out.println("Sell Tea!");
        // }

        // System.out.println("Enter day number");
        // int choice=sc.nextInt();

        // switch (choice) 
        // {
        //     case 1:
        //     System.out.println("Monday");
        //     break;
        //     case 2:
        //     System.out.println("Tuesday");
        //     break;
        //     case 3:
        //     System.out.println("Wednesday");
        //     break;
        //     default:System.out.println("Invalid day");
        //     break;
        // }

        // System.out.println("Enter character");
        // char op = sc.next().charAt(0);
        // switch (op) 
        // {
        //     case '+':
        //     System.out.println("u pressed + character");
        //     break;
        //     case '-':
        //     System.out.println("u pressed - character");
        //     break;
        //     case '*':
        //     System.out.println("u pressed * character");
        //     break;
        //     default:System.out.println("invalid character");
        //     break;
        // }

        System.out.println("Enter day");
        String day = sc.next();

        String choice = day.toLowerCase();
        switch (choice) 
        {
            case "first":
            System.out.println("monday");
            break;
            case "second":
            System.out.println("tuesday");
            break;
            case "third":
            System.out.println("wednesday");
            break;
            default:System.out.println("invalid day");
            break;
        }
        sc.close();
    }
}