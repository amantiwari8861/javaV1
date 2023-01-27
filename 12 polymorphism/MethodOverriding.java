import java.util.Scanner;

class Employee
{
    double chargePerHour;
    double hours;
    double salary;
    Employee()
    {
        chargePerHour=50;
    }
    void calculateSalary(double hours)
    {
        System.out.println("Normal Employee's Salary");
        salary=hours*chargePerHour;
        System.out.println("Your salary is "+salary+" per day");
        System.out.println("Your salary is "+salary*30+" per month");
    }
}
class PermanentEmployee extends Employee
{
    @Override
    void calculateSalary(double hours)
    {
        chargePerHour=100;
        salary=hours*chargePerHour;
        System.out.println("Permanent's Employee Salary Slip");
        System.out.println("Your salary is "+salary+" per day");
        System.out.println("Your salary is "+salary*30+" per month");
    }
}
class Intern extends Employee
{
    @Override
    void calculateSalary(double hours)
    {
        chargePerHour=40;
        salary=hours*chargePerHour;
        System.out.println("Intern's Salary Slip");
        System.out.println("Your salary is "+salary+" per day");
        System.out.println("Your salary is "+salary*30+" per month");
    }
}
public class MethodOverriding 
{
    public static void main(String[] args) 
    {
        // PermanentEmployee pemp=new PermanentEmployee();
        // pemp.calculateSalary(8);
        // System.out.println("==============================");
        // Intern in=new Intern();
        // in.calculateSalary(8);

        Employee emp;
        // emp=new Employee();
        // Employee emp2=new Employee();
        // emp.calculateSalary(8);

        Scanner sc=new Scanner(System.in);
        System.out.println("Which type op employee u are :");
        String emptype=sc.next();

        if (emptype.equalsIgnoreCase("Permanent")) 
        {
            emp=new PermanentEmployee();
            emp.calculateSalary(8);
        } 
        else if(emptype.equalsIgnoreCase("Intern"))
        {
            emp=new Intern();
            emp.calculateSalary(8);
        }
        else 
        {
            emp=new Employee();
            emp.calculateSalary(8);
        }
        sc.close();
    }
}
