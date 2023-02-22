interface ChartedAccountant 
{
    public abstract double deductFoodFee();
    public static final double HEALTH_INSURANCE_PERCENTAGE = 5.0;
    public default double deductHealthInsurancePremium() { return 0.0;   }
    public static void getHealthInsuranceCharge()
    {
        System.out.println("Current Health insurance charge is :"+HEALTH_INSURANCE_PERCENTAGE);
    }
    public default void askCadetails(String designation) 
    {
        if (designation.equalsIgnoreCase("Manager")) 
        {
            getCaDetails();
        }
    }
    private void getCaDetails() 
    {
        System.out.println("Name :Aman");
        System.out.println("Phone :981062743");
        System.out.println("address :delhi");
    }
}
abstract class Employee implements ChartedAccountant 
{
    public abstract double calculateSalary();
}
class FullTimeEmployee extends Employee 
{
    double employeeSalary = 50000;
    public double calculateSalary() { return employeeSalary;   }
    public double deductFoodFee() 
    { 
        employeeSalary=employeeSalary-1000;  
        return 1000;
    }
    public double deductHealthInsurancePremium() 
    { 
        return (HEALTH_INSURANCE_PERCENTAGE * employeeSalary) / 100;
    }
}
class PartTimeEmployee extends Employee 
{
    double empSal=20000;;
    public double calculateSalary() {  return empSal;  }

    public double deductFoodFee() 
    {
        empSal=empSal-1000;
        return 1000;  
    }
}
public class InterfaceNewFeatures 
{
    public static void main(String[] args)
    {

        FullTimeEmployee fEmployee=new FullTimeEmployee();
        
        double charge=fEmployee.deductHealthInsurancePremium();
        System.out.println(charge+" charge deducted from employee salary ");


        ChartedAccountant.getHealthInsuranceCharge();
        fEmployee.askCadetails("Manager");
    }
}