public class Student   //Blue-print
{
    //Attributes (variables)
    int rollNo;//instance variable
    String name;//instance variable
    String schoolName;//instance variable

    Student()  //there is no return type in constructor and it has same name as Class
    {
        System.out.println("default constructor of class Student");
        rollNo=0;
        name="";
        schoolName="DPS";
    }
    //Parameterized constructor
    // Student(int rno,String n,String sc)
    Student(int rn,String name,String schoolName)//local variable
    {
        System.out.println("parameterizrd constructor called");
        rollNo=rn;
        this.name=name;//instance variable name = local variable name
        this.schoolName=schoolName;
    }

    //behaviour (methods or functionality)
    void attendClass()
    {
        System.out.println("attending class");
    }
    void showDetails()
    {
        System.out.println("Roll No :"+rollNo);
        System.out.println("Name :"+name);
        System.out.println("School Name :"+schoolName);
    }
}