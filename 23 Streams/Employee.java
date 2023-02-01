import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int id;
    private String name;
    private int yearsInOrg;

    public Employee(int id, String name,int yearsInOrg) {
        this.id = id;
        this.name = name;
        this.yearsInOrg=yearsInOrg;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public void setYearsInOrg(int yearsInOrg) {
        this.yearsInOrg = yearsInOrg;
    }

	public static List<Employee> getEmpList()
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

    @Override
    public String toString() {
        return "Employee [empid=" + id + ", empname=" + name + "]";
    }

}
