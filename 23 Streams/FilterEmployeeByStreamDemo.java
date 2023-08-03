import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
class Employee
{
    private Integer id;
    private String name;
    private Integer yearsInOrg;
    public String getName() {
		return name;
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
	public Employee(Integer id, String name, Integer yearsInOrg) {
		super();
		this.id = id;
		this.name=name;
		this.yearsInOrg = yearsInOrg;
	}
    @Override
	public String toString() {
		return "Employee [id=" + id + ", yearsInOrg=" + yearsInOrg + ", name=" + name + "]";
	}
	public static List<Employee> getEmployeeList()
	{
	    Employee e1 = new Employee(101,"Roger",0);
    	Employee e2 = new Employee(104,"Chris",2);
    	Employee e3 = new Employee(103,"Samuel",0);
    	Employee e4 = new Employee(102,"Brian",3);
    	List<Employee> empList = new ArrayList<>(); 
    	empList.add(e1);
    	empList.add(e2);
    	empList.add(e3);
    	empList.add(e4);
    	return empList;
	}
}

class EmployeeService
{
    //In the below example different streams are used for sorting and filtering because streams cannot be reused
    public static void main (String[] args) {
        List<Employee> lstEmp = Employee.getEmployeeList();
        //Converting a List into Stream
        Stream<Employee> empStream = lstEmp.stream();
        //Printing the stream
        System.out.println("*****Printing the stream*****");
        empStream.forEach(System.out::println);
        Stream<Employee> empStream_filter = lstEmp.stream();
        //Filtering based on Employee's time in the organization
        System.out.println("*****Filtering the stream*****");
        Stream<Employee> filterEmpStream = empStream_filter.filter(emp -> emp.getYearsInOrg() < 1);
        filterEmpStream.forEach(System.out::println);
        Stream<Employee> empStream_sort = lstEmp.stream();
        System.out.println("*****Sorting the stream*****");
        //Sorting based on Employee ID
        Stream<Employee> sortedEmpStream = empStream_sort.sorted((e1, e2) -> e1.getId() - e2.getId());
        sortedEmpStream.forEach(System.out::println);
        Stream<Employee> empStream_pipeline = lstEmp.stream();
        //Pipelining all the streams into one
        System.out.println("*****Piplelining all the functionalities*****");
        empStream_pipeline.filter(emp -> emp.getYearsInOrg() < 1)
        .sorted((e1, e2) -> e1.getId() - e2.getId())
        .forEach((e) -> System.out.println(e.getId() + ":" + e.getName()));
    }
}

