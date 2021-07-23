// abstraction encapsulation  interfaces string exception nested jdbc
class University
{
    String Uname;
    void uni()
    {
        System.out.println("hello i m university fxn ");
    }
}
class Student extends University
{
    String sname;
    void stu()
    {
        System.out.println("hello i m Student fxn ");
    }
}
public class oops3 {
    
    public static void main(String[] args) {
        
        Student objStudent=new Student();
        objStudent.stu();
        objStudent.uni();

    }
}
