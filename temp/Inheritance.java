class Person
{
    String name;
    int age;
    double height;
    double weight;
    Person(){
        System.out.println("Person is created");
    }
    Person(String name,int age,double height,double weight)
    {
        System.out.println("parameterized constructor called of Person");
        this.name=name; //this represents current class object
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    void showPersonDetails()
    {
        System.out.println("Person Details");
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("height : "+height);
        System.out.println("weight : "+weight);
    }
}
class Student extends Person
{
    int rollNo;
    String schoolName;
    Student(){
        super();
        System.out.println("student is created");
    }
    Student(int rollNo,String schoolName)
    {
        this.rollNo=rollNo;
        this.schoolName=schoolName;
    }
    Student(String name,int age,double height,double weight,int rollNo,String schoolName)
    {
        // this.name=name; //this represents current class object
        // this.age=age;
        // this.height=height;
        // this.weight=weight;
        super(name,age,height,weight);
        this.rollNo=rollNo;
        this.schoolName=schoolName;
        System.out.println("parameterized constructor of student called");
    }
    void showStudentDetails()
    {
        System.out.println("Roll No. :"+rollNo);
        System.out.println("School Name :"+schoolName);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        
        // Student stu=new Student();
        // stu.name="samriddhi";
        // System.out.println("The student name is :"+stu.name);
        // stu.showPersonDetails();

        Student stu=new Student("Aman", 21, 4.4, 5.6, 3, "DPS");
        stu.showPersonDetails();
        stu.showStudentDetails();
    }
}