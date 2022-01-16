import java.util.List;
import java.util.ArrayList;
class Employee
{
	private Integer empId;
    private String empName;
    private String country;
	
	public Employee(Integer empId, String empName, String country) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.country = country;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}

class ItrateList
{
    public static void main (String[] args) {
        Employee e1 = new Employee(101,"Aron","France");
    	Employee e2 = new Employee(102,"Cindia","Uzbekistan");
    	Employee e3 = new Employee(103,"Zidane","Singapore");
    	Employee e4 = new Employee(104,"Emilia","Mongolia");
    	List<Employee> empList = new ArrayList<>(); 
    	empList.add(e1);
    	empList.add(e2);
    	empList.add(e3);
    	empList.add(e4);
    	
    	/*for (Employee emp : empList) {  //Traditional for-each loop
            System.out.println(emp.getCountry());
        }*/
            
        empList.forEach(emp -> System.out.println(emp.getCountry()));
        
    }
}