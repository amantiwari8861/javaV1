import java.util.ArrayList;
import java.util.List;

class Employee {
    private Integer empId;
    private String empName;
    private String country;

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public Employee(Integer empId, String empName, String country) {
        this.empId = empId;
        this.empName = empName;
        this.country = country;
    }
    public String toString() {
        return "empId : " + empId + ", empName : " + empName + ", country : " + country;
    }
}

public class ComparableWithLambda {
    public static void main(String[] args) {

        // To sort a list empList by implementing Comparator interface
        System.out.println("Example 4: To use lambda expression for sorting using Comparator interface");
        Employee e1 = new Employee(101, "Raj", "India");
        Employee e2 = new Employee(102, "Ishita", "Australia");
        Employee e3 = new Employee(103, "Aman", "America");
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        System.out.println("Before sort: " + empList);
        empList.sort(
            (employee1, employee2) -> employee1.getCountry()
                .compareTo(employee2.getCountry())
        );
        System.out.println("After sort: \n" + empList);
    }
}
