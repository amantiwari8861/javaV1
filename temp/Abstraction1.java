import java.util.Scanner;

abstract class Employee
{
    int id;
    String name;
    double workingHour;
    double chargePerHour;
    double salary;

    abstract void calculateSalary();
}
class Developer extends Employee
{
    @Override
    void calculateSalary()
    {
        workingHour=9;
        chargePerHour=100;
        salary=28*workingHour*chargePerHour;
        System.out.println("Developer Salary is :"+salary);
        System.out.println("we will charge 10% of salary as pf :"+(salary*0.10));
    }
}
class Manager extends Employee
{
    @Override
    void calculateSalary()
    {
        workingHour=9;
        chargePerHour=150;
        salary=28*workingHour*chargePerHour;
        System.out.println("Manager Salary is :"+salary);
        System.out.println("we will charge 15% of salary as pf :"+(salary*0.15));
    }
}
public class Abstraction1 {

    public static void main(String[] args) {
        
        //Abstraction : hiding the implimentation detail and showing only functionality

        // Employee employee=new Employee();

        // Developer alka=new Developer();
        // alka.calculateSalary();

        // Manager avinash=new Manager();
        // avinash.calculateSalary();        

        // Employee emp=new Developer();
        // emp.calculateSalary();

        Employee emp=null;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee Name :");
        String empName=sc.nextLine();

        if (empName.equals("satish")) 
        {
            emp=new Developer();
        }
        else if(empName.equals("alka"))
        {
            emp=new Manager();
        }
        else
        {
            System.out.println("Not a registered employee");
        }

        if (emp!=null)
        {
            emp.calculateSalary();
        }
        sc.close();
    }
}