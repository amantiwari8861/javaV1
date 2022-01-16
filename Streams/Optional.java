import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Employee {

	private String name;
	private Integer id;
	private Double sal;

	public Employee() {
		// Default constructor
	}

	public Employee(String name, Integer id, Double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;

	}

	public String getName() {
		return name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
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

	
}

class FullTimeEmployee extends Employee {
	// Employee associated with passport
	private Passport passport;

	public FullTimeEmployee() {

	}

	public FullTimeEmployee(String name, Integer id, Double sal, Passport passport) {
		super(name, id, sal);
		this.passport = passport;
	}

	public Optional<Passport> getPassport() {
		// returns passport reference
		return Optional.ofNullable(passport);
		// return Optional.empty();
		// return Optional.of(passport);
	}

	public void setPassport(Passport passportt) {
		// sets passport reference
		this.passport = passportt;
	}

	public static List<FullTimeEmployee> getEmployeeList() {
		List<FullTimeEmployee> employeeList = new ArrayList<>();
		// Creating employee objects with passport

		Passport p1 = new Passport(10121);
		FullTimeEmployee e1 = new FullTimeEmployee("Robert", 102, 10000D, p1);

		Passport p2 = new Passport(10122);
		FullTimeEmployee e2 = new FullTimeEmployee("James", 105, 15000D, p2);

		// Creating employee objects without passport
		FullTimeEmployee e3 = new FullTimeEmployee();
		e3.setId(107);
		e3.setName("Tyrion");
		e3.setSal(21000D);

		FullTimeEmployee e4 = new FullTimeEmployee();
		e4.setId(110);
		e4.setName("Bruce");
		e4.setSal(8000D);

		// adding the objects into a list
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);

		return employeeList;
	}
}

class Passport {
	private int passportNo;

	public Passport(int passportNo) {
		super();
		this.passportNo = passportNo;
	}

	public int getPassportNo() {
		return passportNo;
	}

	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
}

class EmployeeStarter {
	public static void main(String[] args) {
		// Code to retrieve employees and to store them in a list called employeesList
		List<FullTimeEmployee> employeesList = FullTimeEmployee.getEmployeeList();
		List<Integer> passportNumbers = new ArrayList<>();
		// List to collect the passport numbers
		for (FullTimeEmployee employee : employeesList) {
			// if(employee.getPassport() != null)
			// passportNumbers.add(employee.getPassport().getPassportNo());

			Optional<FullTimeEmployee> optEmp = Optional.of(employee);
			passportNumbers.add(optEmp.flatMap(FullTimeEmployee::getPassport).map(Passport::getPassportNo).orElse(0));

			// passportNumbers.add(employee.getPassport().orElse(new Passport(0)).getPassportNo());
		}
		passportNumbers.forEach(x -> System.out.println("Passport number: " + x));

	}
}
