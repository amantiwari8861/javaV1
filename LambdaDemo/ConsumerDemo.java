import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

class Employee
{
	private Integer id;
    private String name;
    private String role;
    private Double sal;
	
	public Employee(Integer id, String name, String role, Double sal) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.sal = sal;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		this.name = name;
	}
	public static List<Employee> getEmpList() {
	    Employee e1 = new Employee(101,"Aron","Sr System Engineer",25000D);
    	Employee e2 = new Employee(102,"Cindia","System Engineer",20000D);
    	Employee e3 = new Employee(103,"Zidane","Technology Lead",35000D);
    	Employee e4 = new Employee(104,"Emilia","Technology Architect",40000D);
    	List<Employee> empList = new ArrayList<>(); 
    	empList.add(e1);
    	empList.add(e2);
    	empList.add(e3);
    	empList.add(e4);
    	return empList;
	}
}

public class ConsumerDemo {
    public static void main(String[] args) {
        List<Employee> lstEmp = Employee.getEmpList();
 
        System.out.println("***** Generating HR Report *****");
        generateReport(lstEmp, e -> System.out.println(e.getId() + " : " + e.getName() + " : " + e.getRole() + " : " + e.getSal()));
 
        System.out.println("\n***** Generating Manager Report *****");
        generateReport(lstEmp, e -> System.out.println(e.getId() + " : " + e.getName() + " : " + e.getRole()));
    }
 
    public static void generateReport(List<Employee> lstEmp, Consumer<Employee> consumer) {
        for (Employee e : lstEmp) {
            consumer.accept(e);
        }
    }
}

