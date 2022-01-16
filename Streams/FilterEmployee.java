import java.util.*;

public class FilterEmployee {
    public static void main(String[] args) {
        List<Employee> lstEmp = Employee.getEmployeeList();
        List<Employee> listNewEmp = new ArrayList<>();
        for (Employee emp : lstEmp) {
            if (emp.getYearsInOrg() < 1) { // Filtering
                listNewEmp.add(emp);
            }
        }

        Collections.sort(listNewEmp, new Comparator<Employee>() { // logic for sorting
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getId() - employee2.getId();
            }
        });

        for (Employee newEmp : listNewEmp) {
            System.out.println(newEmp.getId() + ":" + newEmp.getName()); // content display
        }
    }
}

/*
 * import java.util.*;
 * 
 * public class FilterEmployee {
 * public static void main(String[] args) {
 * List<Employee> lstEmp = Employee.getEmpList();
 * List<Employee> lstNewEmp = new ArrayList<>();
 * 
 * lstEmp.forEach((e) -> { if(e.getYearsInOrg() < 1) // Filtering
 * lstNewEmp.add(e);
 * });
 * lstNewEmp.sort((employee1,employee2) -> employee1.getId() -
 * employee2.getId()); // Sorting
 * lstNewEmp.forEach((e) -> System.out.println(e.getId() + ":" + e.getName()));
 * // Displaying
 * }
 * }
 */
