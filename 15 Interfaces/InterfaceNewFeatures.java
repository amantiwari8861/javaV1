public interface ChartedAccountant {
    public abstract double deductFoodFee();
    public static final double HEALTH_INSURANCE_PERCENTAGE = 5.0;
    public default double deductHealthInsurancePremium() {    }
}

public abstract class Employee implements ChartedAccountant {
    public abstract double calculateSalary();
}
public class FullTimeEmployee extends Employee {
    double employeeSalary = 50000;
    public double calculateSalary() {
    }
    public double deductFoodFee() {
    }
    public double deductHealthInsurancePremium() 
    { // Default method getting overridden
        return (HEALTH_INSURANCE_PERCENTAGE * employeeSalary) / 100;
    }
}
public class PartTimeEmployee extends Employee {
    public double calculateSalary() {
    }

    public double deductFoodFee() {
    }
}
public class InterfaceNewFeatures {
    public static void main(String[] args) {

    }
}