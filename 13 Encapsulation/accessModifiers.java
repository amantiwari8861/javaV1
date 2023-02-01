public class Employee {
    private int empid;
    private String name;

    String getName() {
        return name;
    }
    int getEmpId() {
        return empid;
    }
    void setDetails(int empid,String name) { //setter
        this.name=name;
        this.empid=empid;
    }
}
class Main
{
    public static void main(String[] args) {
        
        String EmployeeName;
        int EmployeeId;
        Employee objEmployee=new Employee();
        objEmployee.setDetails(101,"Aman");
       
       EmployeeName= objEmployee.getName();
        EmployeeId= objEmployee.getEmpId();

        System.out.println("i accesed the private variable of Employee Class ");
        System.out.println("Name : "+EmployeeName);
        System.out.println("ID : "+EmployeeId);
    }
}