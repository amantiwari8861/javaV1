public class TechSolLuckyDraw {
    public static void main(String[] args) {
        // lstEmpIds is the populated list of employee ids
        printEvenIds(lstEmpIds);
        printOddIds(lstEmpIds);
        printIdsForStock(lstEmpIds);
    }
 
    public static void printEvenIds(List<Integer> lstEmpIds) {
        for(int id : lstEmpIds) {
            if(id % 2 == 0) System.out.println("Even Employee Id: " + id);
        }
    }
 
    public static void printOddIds(List<Integer> lstEmpIds) {
        for(int id : lstEmpIds) {
            if(id % 2 != 0) System.out.println("Odd Employee Id: " + id);
        }
    }
 
    public static void printIdsForStock(List<Integer> lstEmpIds) {
        for(int id : lstEmpIds) {
            if(id < 1500) System.out.println("Employee Id less than 1500: " + id);
        }
    }
}


import java.util.*;
import java.util.function.Predicate;
 
public class TechSolLuckyDraw {
    //main method
    public static void main(String[] args) {
        // lstEmpIds is the populated list of employee ids
        System.out.println("Printing Even Employee Ids");
        evaluate(lstEmpIds, (n) -> n % 2 == 0);
        System.out.println("Printing Odd Employee Ids");
        evaluate(lstEmpIds, (n) -> n % 2 == 1);
        System.out.println("Printing Employee Ids less than 1500");
        evaluate(lstEmpIds, (n) -> n < 1500);
    }
    public static void evaluate(List<Integer> listEmpId, Predicate<Integer> predicateArg) {
        for(int empId : listEmpId) {
            if(predicateArg.test(empId))
                System.out.println(empId);
        }
    }
}