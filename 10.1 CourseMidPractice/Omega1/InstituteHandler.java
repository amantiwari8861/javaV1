import java.util.Scanner;

public class InstituteHandler {

    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);
        Institute institute = new Institute(sc);
        do {
            System.out.println("\033[H\033[2J");
            System.out.println("\n*********** Input Ur Choice ************");
            System.out.println("1.Enroll Student ");
            System.out.println("2.Show All Student Details");
            System.out.println("3.Get student details by Id ");
            System.out.println("4.Update Student Record");
            System.out.println("5.Delete Student record");
            System.out.println("0.Exit");
            System.out.print("\t\tEnter ur choice :");
            choice = sc.nextInt();

             switch (choice) {
                case 1:
                    institute.enrollStudent();
                    break;
                case 2:
                    institute.showAllStudentsDetails();
                    break;
                case 3:
                    institute.getStudentDetailById();
                    break;
                case 4:
                    institute.updateStudentdetails();
                    break;
                case 5:
                    institute.deleteStudentDetails();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
            sc.nextLine();
            System.out.print("\npress any key to continue....... ");
            sc.nextLine();
        } while (choice != 0);

        System.out.println("thankyou for using our software");
        sc.close();
    }
}
