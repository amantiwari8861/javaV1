class Emp4
{
    int id=101;
    String name;
    double salary;
    int age;
    Emp4(String name2)
    {
        name=name2;
    }
    void setSalary(double sal)
    {
        salary=sal;
    }
    void show()
    {
        System.out.println("Id is "+id);
        System.out.println("Name is "+name);
        System.out.println("Salary is "+salary);
        System.out.println("Age is "+age);
    }
}
public class SetValueInInstanceVariable {
    public static void main(String[] args) {
    //1st way to set the value in instance variable
    Emp4 e1=new Emp4("Hemant");
    //2nd way to set the value in instance variable
    e1.setSalary(10000);
    //3rd way to set the value in instance variable
    e1.age=20;
    //printing the value of instance variable
    e1.show();        
    }
}