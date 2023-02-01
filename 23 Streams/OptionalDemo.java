import java.util.Optional;
 class EmployeeDetail {
	private String alternateEmail;
	public Optional<String> getAlternateEmail() {
		return Optional.ofNullable(alternateEmail);
	}
	public EmployeeDetail(String alternateEmail) {
		this.alternateEmail=alternateEmail;
	}
}

public class OptionalDemo {
	public static void main(String[] args) {
		EmployeeDetail employeeDetailOptional = new EmployeeDetail(new String("John@abc.com"));
		System.out.println(employeeDetailOptional.getAlternateEmail().isPresent());
	}
}

// import java.util.Optional;
// @SuppressWarnings("")
// public class EmployeeDetail {
// 	private String alternateEmail;
// 	public Optional<String> getAlternateEmail() {
// 		return Optional.ofNullable(alternateEmail);
// 	}
// 	public void setAlternateEmail(String alternateEmail) {
// 		this.alternateEmail=alternateEmail;
// 	}
// }
// public class TechSol {
// 	public static void main(String[] args) {
// 		EmployeeDetail employee1=new EmployeeDetail();
// 		EmployeeDetail employee2=new EmployeeDetail();
// 		employee1.setAlternateEmail("John@abc.com");
// 		System.out.println(employee1.getAlternateEmail().orElse("def@abc.com"));
// 		System.out.println(employee2.getAlternateEmail().orElse("def@abc.com"));
// 	}
// }