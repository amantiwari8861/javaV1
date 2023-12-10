import java.util.Scanner;

public class SalaryHandler {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String empNames[];
        double empSalary[];

        int noOfEmployees;
        System.out.print("Enter no. of employees:");
        noOfEmployees=sc.nextInt();

        empNames=new String[noOfEmployees];
        empSalary=new double[noOfEmployees];

        System.out.println("Enter employees Name and Salary :");
        for (int i = 0; i < noOfEmployees; i++) 
        {
            sc.nextLine();
            System.out.print("Enter "+(i+1)+" employee Name :");
            empNames[i]=sc.nextLine();
            System.out.print("Enter "+(i+1)+" employee Salary :");
            empSalary[i]=sc.nextDouble();
        }
        System.out.println("\nAll Employees Details ");
        for (int i = 0; i < noOfEmployees; i++) 
        {
            System.out.println((i+1)+"."+empNames[i]+" : "+empSalary[i]);
        }
    }
}