import java.util.*;
 
public class FilterEmployeeByStream {
    public static void main(String[] args) {
        List<Employee> lstEmp = Employee.getEmployeeList();
 
        lstEmp.stream().filter(emp -> emp.getYearsInOrg() < 1)
        .sorted((e1, e2) -> e1.getId() - e2.getId())
        .forEach((e) -> System.out.println(e.getId() + ":" + e.getName()));
    }
}
