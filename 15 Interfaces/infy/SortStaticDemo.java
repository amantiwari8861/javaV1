// public interface AccountDepartment 
// {
//     public abstract double deductFoodFee(); // Must be overridden by all implementing classes
//     final double HEALTH_INSURANCE_PERCENTAGE = 5.0;
//     final double PENSION_PERCENTAGE = 5.0;
//     public default double deductHealthInsurancePremium() 
//     {   // Need not be overridden
//         // Default implementation which can be redefined
//     }
//     public static double deductForPension(double employeeSalary) 
//     { // Static method of the interface
//         return (employeeSalary * PENSION_PERCENTAGE / 100);
//     }
// }

// public class PartTimeEmployee extends Employee 
// {

//     // field declarations
//     public double calculateSalary() {
//         // calculating salary - part time employee
//         this.employeeSalary -= AccountDepartment.deductForPension(this.employeeSalary);
//         // Further operations
//     }
//     public double deductFoodFee() {
//         // Food fee deduction from salary
//     }
// }
// Here are some observations about the static methods of interfaces:
// Static methods in interfaces help to provide utility methods. For example,
// null check, collection sorting, etc
// Methods of java.lang.Object can never be defined as static methods in
// interfaces
// The Comparator interface of Java 8 is a perfect example in which the static
// methods have been included: comparingInt(), comparingDouble(),
// comparingLong(), naturalOrder(), nullsFirst(), nullsLast() and reverseOrder()
// Let us see an example of the static method, naturalOrder() of Comparator
// interface:

import java.util.*;

public class SortStaticDemo 
{
    public static void main(String[] args) 
    {
        List<String> countrylst = Arrays.asList("India", "America", "Japan", "Brazil");
        countrylst.sort(Comparator.reverseOrder()); // will sort in String natural sorting order
        for (String countryName : countrylst) 
        {
            System.out.println(countryName);
        }
    }
}
