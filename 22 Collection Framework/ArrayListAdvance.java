import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAdvance {
public static void main(String[] args) {
    
    // Create an ArrayList of Employee
    ArrayList<Object> empList = new ArrayList<Object>();
    
    // Create Employee objects
    Employee e1 = new Employee();
    e1.setEmpid(101);
    e1.setName("Aman");
    e1.setDept("IT");
    e1.setSalary(100000);
    
    Employee e2 = new Employee();
    e2.setEmpid(102);
    e2.setName("Ritik");
    e2.setDept("HR");
    e2.setSalary(20000);
    
    Employee e3 = new Employee();
    e3.setEmpid(103);
    e3.setName("hemant");
    e3.setDept("Finance");
    e3.setSalary(30000);
    
    // Add the Employee objects in ArrayList
    empList.add(e1);
    empList.add(e2);
    empList.add(e3);
    
    // System.out.println("Employee 1: " + e1);
    // Display the ArrayList
    // System.out.println("Employee List: \n" + empList);

    // for (Employee employee : empList) {
    //     System.out.println(employee);
    // }
    // Iterator itr = empList.iterator();
    // while(itr.hasNext()){
    //     System.out.println(itr.next());
    // }
    
     // Get the Employee object at index 0
    Employee e = empList.get(0);
    System.out.println("Employee at index 0: " + e);
    /* 
    // Get the Employee object at index 1
    e = empList.get(1);
    System.out.println("Employee at index 1: " + e);
    
    // Get the Employee object at index 2
    e = empList.get(2);
    System.out.println("Employee at index 2: " + e); */
    
}
    
}