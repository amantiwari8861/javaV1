import java.time.LocalDate;

// public class Employee implements Comparable<Employee>
public class Employee
{
    private Integer id;
    private String name;
    private String email;
    private LocalDate dateOfBirth;
    
    public Employee() {
    }
    public Employee(Integer id, String name, String email, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
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
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", dateOfBirth=" + dateOfBirth + "]";
    }
    // @Override
    // public int compareTo(Employee o) 
    // {
        // return this.id-o.getId(); //for ascending order
    //     return o.getId()-this.id; //for descending order
    // }
}