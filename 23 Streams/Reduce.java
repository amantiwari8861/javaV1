import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.Optional;

class Employee
{
    private Integer id;
    private String name;
    private Integer sal;
    private Integer yearsInOrg;
    
    public String getName() {
		return name;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getYearsInOrg() {
		return yearsInOrg;
	}
	public void setYearsInOrg(Integer yearsInOrg) {
		this.yearsInOrg = yearsInOrg;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", yearsInOrg=" + yearsInOrg + "]";
	}
	public Employee(Integer id, String name, Integer sal, Integer yearsInOrg) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.yearsInOrg = yearsInOrg;
	}
	public static List<Employee> getEmpList()
	{
	    Employee e1 = new Employee(34578,"Cathy Ivy",35000,0);
    	Employee e2 = new Employee(41234,"Damodar Charan",61000,0);
    	Employee e3 = new Employee(22347,"Netaa Singh",100000,0);
    	Employee e4 = new Employee(11345,"Brian Anderson",160000,3);
    	List<Employee> empList = new ArrayList<>(); 
    	empList.add(e1);
    	empList.add(e2);
    	empList.add(e3);
    	empList.add(e4);
    	return empList;
	}
}

class FilterEmployee {
    public static void main(String[] args) {
        List <Employee> lstEmp = Employee.getEmpList();
	
        List<Employee> lstNewEmp = lstEmp.stream().filter(emp -> emp.getYearsInOrg() < 1)
            .map(e -> { e.setSal(e.getSal() + 5000); return e; })    // Incrementing salary
            .collect(Collectors.toList());
 
        System.out.println("Employees less than a year old with increment:");
        lstNewEmp.forEach(e -> System.out.println(e.getId() + ":" + e.getName() + ":" + e.getSal())); 
 
        Optional<Integer> max = lstNewEmp.stream().map(e->e.getSal())
            .reduce(Integer::max);    // Finding the maximum salalry
        List<Employee> lstMaxEmp =  lstNewEmp.stream()
            .filter(e -> e.getSal().equals(max.get()))    // Finding employees with the maximum salary
            .collect(Collectors.toList());
 
        System.out.println("\nEmployees having maximum salary after increment:");
        lstMaxEmp.forEach(e -> System.out.println(e.getId() + ":" + e.getName() + ":" + e.getSal())); 
    }
}