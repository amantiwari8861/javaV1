import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class Employee {
	
	private int empId;
	private String empname;
	private double sal;
	int exp;
	String gender;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Employee(int empId, String empname, double sal, int exp, String gender) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.sal = sal;
		this.exp = exp;
		this.gender = gender;
	}
	
	public double generateSalarySlip() {
		System.out.println("SalarySlip of Employee");
		return this.getSal();		//no increment
	}
	
	public static List<Employee> getEmployees()
	{
		List <Employee> newlist=new ArrayList<>();
		newlist.add(new Employee(100, "Unnati", 35000D, 10, "F"));
		newlist.add(new Employee(104, "Sneha", 25000D, 8, "F"));
		
		newlist.add(new FullTimeEmployee(107,"Nikhil",40000D,5,"M"));
		newlist.add(new FullTimeEmployee(101, "Kiran", 33000D, 2, "M"));
		
		newlist.add(new PartTimeEmployee(103, "Salma", 15000D, 3, "M"));
		newlist.add(new PartTimeEmployee(102, "Celine", 20000D, 4, "F"));
		
		return newlist;
	}
} 

class FullTimeEmployee extends Employee
{
	public double generateSalarySlip() {
		System.out.println("SalarySlip of FullTime Employee");
		return super.getSal()*1.20;			//20% increment
	}
	
	public FullTimeEmployee(int empId, String empname, double sal, int exp, String gender) {
		super(empId, empname, sal,exp,gender);
		// TODO Auto-generated constructor stub
	}
}

class PartTimeEmployee extends Employee
{
	public double generateSalarySlip() {
		System.out.println("SalarySlip of PartTime Employee");
		return super.getSal()*1.10;		//10% increment
	}
	
	public PartTimeEmployee(int empId, String empname, double sal, int exp, String gender) {
		super(empId, empname, sal,exp,gender);
		// TODO Auto-generated constructor stub
	}
}

public class SupplierDemo {
	public static void main(String[] args) {
		
        List<? extends Employee> lstEmp = Employee.getEmployees();
        for (Employee e : lstEmp) {
            generate(() -> e);
        }
    }

    public static void generate(Supplier<? extends Employee> supplier) {
        System.out.println(supplier.get().generateSalarySlip());
    }
} 

 
