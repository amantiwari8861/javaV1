import java.util.Scanner;
class Student
{
    String name;
    int marks;
    int rollno;
    float salary;

    // Student(String name,int marks)
    // {
    //     this.name=name;
    //     this.marks=marks;
    // }
    // Student(int marks,String name)
    // {
    //     this.name=name;
    //     this.marks=marks;
    // }
    // Student(String name,int marks,int rollno)
    // {
    //     this.name=name;
    //     this.marks=marks;
    //     this.rollno=rollno;
    // }
        // Student(int marks,float salary)
        // {
        //     this.marks=marks;
        //     this.salary=salary;
        // }
        // Student(float salary,int marks)
        // {
        //     this.marks=marks;
        //     this.salary=salary;
        // }
            Student(float salary)
            {
                this.salary=salary;
            }

    public void output()
    {
        System.out.println("the student name is "+name+" marks is "+marks+" rollno is "+rollno+" salary = "+salary);
    }
}
public class overloading {
    public static void main(String[] args) {
        
        // Student objStudent=new Student("aman",99);
        // objStudent.output();
        // Student objStudent3=new Student(23,"naman");
        // objStudent3.output();
        // Student objStudent2=new Student("naman",9,22);
        // objStudent2.output();
        // Student objStudent=new Student(12,3000.14f);
        // objStudent.output();
        // Student objStudent2=new Student(3000f,12);
        // objStudent2.output();
        Student objStudent=new Student(2000);
        objStudent.output();
    }
}

