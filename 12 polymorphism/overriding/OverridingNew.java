class Employee
{
    int id;
    String name;
    double workingHour;
    double chargePerHour;
    double salary;

    void calculateSalary()
    {
        workingHour=8;
        chargePerHour=50;
        salary=30*workingHour*chargePerHour;
        System.out.println("Normal Employee Salary is :"+salary);
    }
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
public class OverridingNew {

    public static void main(String[] args) {

        //Overriding : when a parent class method gets modified(overridden) by child class it is called

        Employee satish=new Employee();
        satish.calculateSalary();

        Developer alka=new Developer();
        alka.calculateSalary();

        Manager avinash=new Manager();
        avinash.calculateSalary();        
    }
}