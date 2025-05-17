import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HrDept {
    public static void main(String[] args) {
        
        List<Employee> employees=new ArrayList<>();

        employees.add(new Employee(1,"Harsh","harsh@1234gmail.com",LocalDate.now()));
        employees.add(new Employee(2,"Harsh Kasana","aarsh@1234gmail.com",LocalDate.of(2024, 2, 29)));
        employees.add(new Employee(33,"Krishna Kasana","Barsh@1234gmail.com",LocalDate.of(2024, 2, 29)));
        employees.add(new Employee(20,"Aakash Raj","Zarsh@1234gmail.com",LocalDate.of(2024, 2, 29)));
        employees.add(new Employee(5,"Xavier","Xavier@1234gmail.com",LocalDate.of(2024, 2, 29)));

        // Collections.sort(employees);
        // Collections.sort(employees,new SortByIdAscending());
        // Collections.sort(employees,new SortByIdDescending());
        // Collections.sort(employees,new SortByNameAscending());
        // Collections.sort(employees,(e1,e2)->e2.getName().compareTo(e1.getName()));
        Collections.sort(employees,(e1,e2)->e1.getEmail().compareTo(e2.getEmail()));
        // Collections.sort(employees);
        // System.out.println(employees);
        System.out.println("All Employees Details:");
        for (Employee employee : employees) 
        {
            System.out.println(employee);
        }
    }
}
class SortByIdAscending implements Comparator<Employee>
{
    @Override
    public int compare(Employee e1, Employee e2) 
    {
        return e1.getId()-e2.getId();
    }
}
class SortByIdDescending implements Comparator<Employee>
{
    @Override
    public int compare(Employee e1, Employee e2) 
    {
        return e2.getId()-e1.getId();
    }
}
class SortByNameAscending implements Comparator<Employee>
{
    @Override
    public int compare(Employee e1, Employee e2) 
    {
        return e1.getName().compareTo(e2.getName());
    }
}