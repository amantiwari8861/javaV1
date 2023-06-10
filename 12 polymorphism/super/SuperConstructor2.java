class Employee
{
    String companyName;
    String empId;
    String name;
    double salary;
    Employee()
    {
        companyName="My Edu Galaxy Advance Carrer Institute";
        System.out.println("Employee class default constructor called");
    }
    Employee(String name)
    {
        this();
        this.name=name;
        empId=name.substring(0,2)+1+"@Mega";
    }

}
class PermanentEmployee extends Employee
{
    double bonus;
    PermanentEmployee(){
        System.out.println("Permanent Employee class default constructor called");

    }
    PermanentEmployee(String name)
    {
        // super();//java automatically calls super class constructor in case of inheritance
        super(name);
        bonus=50000;
        System.out.println("Permanent Employee class 1 parameterized constructor called");

    }
    PermanentEmployee(String name,double salary)
    {
        // System.out.println("hiiii"); //error bcz super const. calling must be first statement
        this(name);
        this.salary=salary;
    }
    void showDetails()
    {
        System.out.println("Company Name : "+companyName);
        System.out.println("Bonus : "+bonus);
        System.out.println("Employee Id :"+empId);
        System.out.println("Employee Salary :"+salary);
        
    }
}
public class SuperConstructor2 
{
    public static void main(String[] args) {
        
        // PermanentEmployee pe=new PermanentEmployee();
        // pe.showDetails();
        // PermanentEmployee pem=new PermanentEmployee("Aman Tiwari");
        // pem.showDetails();
        PermanentEmployee pem2=new PermanentEmployee("Aman Tiwari",15000);
        pem2.showDetails();
    }
}