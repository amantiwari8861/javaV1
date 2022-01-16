import java.util.List;
import java.util.ArrayList;

interface DemoInterface1 { //To implement the lambda expression with no arguments
    void noArguments();
}

interface DemoInterface2 { //To implement the lambda expression with two arguments
    void twoArguments(String s1, Integer i1);
}

interface DemoInterface3 { //To implement the lambda expression with one argument
    Integer singleArgument(Integer i1);
}

class Employee {
    Integer empId;
    String empName;
    String country;
    
    public void setEmpId(Integer empId){
        this.empId = empId ;
    }
    
    public Integer getEmpId(){
        return this.empId;
    }
    
    public void setEmpName(String empName){
        this.empName = empName ;
    }
    
    public String getEmpName(){
        return this.empName;
    }
    
    public void setCountry(String country){
        this.country = country ;
    }
    
    public String getCountry(){
        return this.country;
    }
    
    public Employee(Integer empId,String empName, String country)
    {
        this.empId=empId;
        this.empName=empName;
        this.country=country;
    }
    //Object
    public String toString()
    {
        return "empId : "+empId+", empName : "+empName+", country : "+country;
    }
}

public class LambdaDemo
{
    public static void main (String[] args) {
        //Example 1: To access a method with no arguments
        System.out.println("Example 1: No argument lambda expression ");
        DemoInterface1 demoInterface1 = () -> {System.out.println("No arguments");};
        demoInterface1.noArguments();
        System.out.println(); //for line spacing
        
      //Example 2: To access a method with 2 arguments
        System.out.println("Example 2: Multiple arguments lambda expression ");
        DemoInterface2 demoInterface2 = (String s, Integer i) -> System.out.println("String value: "+s+", Integer value: "+i);
        demoInterface2.twoArguments("Christiano Ronaldo", 7);
        System.out.println(); //for line spacing
        
       //Example 3: To access a method with 1 argument
        System.out.println("Example 3: One argument lambda expression to print square of the given Integer number");
        DemoInterface3 demoInterface3 = (k) -> k*k;
        // DemoInterface3 demoInterface3 = (k) ->{ return k*k; };
        // DemoInterface3 demoInterface3 = k -> k*k;
        System.out.println(demoInterface3.singleArgument(7));
        System.out.println(); //for line spacing
        
        //Example 4: To sort a list empList by implementing Comparator interface
        System.out.println("Example 4: To use lambda expression for sorting using Comparator interface");
        Employee e1 = new Employee(101,"Robert","Canada");
        Employee e2 = new Employee(102,"Ibrahim","Azerbaijan");
        Employee e3 = new Employee(103,"Wang","Japan");
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        System.out.println("Before sort: "+empList);
        empList.sort((employee1, employee2) -> employee1.getCountry().compareTo(employee2.getCountry()));
        System.out.println("After sort: "+empList);
    }
}