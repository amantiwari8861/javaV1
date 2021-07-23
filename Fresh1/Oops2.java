class Student
{
    Student()
    {
        System.out.println("hello i am default constructor");
    }
    Student(int num)
    {
        System.out.println("hello i am parameterized constructor");
        age=num;
    }
    // final int age=20; //instance variables
    int age; //instance variables
    String name;

    public void details()
    {
        System.out.println("calling detail fxn "+age);
    }
    public void initialize(int age) {
        this.age=age;
    }
}
class Oops2
{
    public static void main(String[] args) {
        

        // Student objStudent0=new Student(); //default
        // Student objStudent=new Student(10); //parameterized
        // Student objStudent2=new Student(40);
        // objStudent.age=25;
        // objStudent2.age=22;
        // objStudent0.details();
        // objStudent.details();
        // objStudent2.details();
        Student objStudent3=new Student();
        objStudent3.initialize(50);
        objStudent3.details();
    }
}