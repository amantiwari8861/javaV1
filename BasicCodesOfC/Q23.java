import java.util.Scanner;

class Q23 {
    public static void main(String[] args) {
        
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month:");
        month = sc.nextInt();
        String months[] = { "jan", "feb", "march" };

        System.out.println(months[month - 1]);
        // switch (month)
        // {
        // case 1:
        // System.out.println("January");
        // break;
        // case 2:
        // System.out.println("February");
        // break;
        // case 3:
        // System.out.println("March");
        // break;
        // case 4:
        // System.out.println("April");
        // break;
        // default:
        // System.out.println("Invalid month");
        // break;
        // }

        // if(month==1)
        // {
        // System.out.println("January");
        // }
        // else if(month ==2)
        // {
        // System.out.println("February");
        // }
        // else{

        // }

 

        sc.close();
    }
}