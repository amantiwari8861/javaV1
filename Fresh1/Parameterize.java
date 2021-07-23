class Student
{
    String name;//instance varizables
    int marks;
    int rollno;
    Student(String name,int marks,int rollno)
    {
        this.name=name;
        this.marks=marks;
        this.rollno=rollno;
    }
    public void output() {

        System.out.println("the student name is "+name+" marks is "+marks+" rollno is "+rollno);
    }
}
public class Parameterize {
    public static void main(String[] args) {
        
        Student objStudent=new Student("Aman", 99, 21);
        objStudent.output();
    }
}