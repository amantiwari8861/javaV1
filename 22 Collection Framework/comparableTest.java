import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>{

    private Integer id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;


	@Override
	public int compareTo(Employee e) {
		return this.getName().compareTo(e.getName());
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Main 
{
    public static void main(String[] args) {
    ArrayList<Employee> employees = methodReturnsUnsortedList();

    Collections.sort(employees);
    }
}