import Persons.Student;
import Persons.university.courses.JavaCourse;
// import Persons.university.courses.*;
// import institute.courses.JavaCourse;

// import java.util.Scanner;

public class App extends Student
{
    public static void main(String[] args)
    {
        // System.out.println("Hello, World!");
        // Student stu=new Student();
        // stu.greet();
        // System.out.println(stu.name);
        // System.out.println(stu.rollNo);
        // System.out.println(stu.fatherName);
        // System.out.println(stu.phoneNo);

        // App a=new App();
        // System.out.println(a.rollNo);
        // PythonCourse pc=new PythonCourse();
        // pc.content();
        JavaCourse jc=new JavaCourse();
        jc.content();
        
        institute.courses.JavaCourse jc2=new institute.courses.JavaCourse();
        jc2.content();
    }
}
