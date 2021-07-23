import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter ur Value ");

        String day=obj.next(); 

        switch (day) {

            case "monday":System.out.println("the day is monday");
                break;
            case "tuesday":System.out.println("the day is monday");
                break;
            default: System.out.println("Sunday");
                break;
        }
    }
}
