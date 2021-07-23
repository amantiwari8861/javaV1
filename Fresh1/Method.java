import java.util.Scanner;
class Student
{
    String name;
    int marks;
    int rollno;
    public void input() {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the name ");
        name=obj.nextLine();
        marks=obj.nextInt();
        rollno=obj.nextInt();
        obj.close();
    }
    public void output() {

        System.out.println("the student name is "+name+" marks is "+marks+" rollno is "+rollno);
    }
}
public class Method {
    public static void main(String[] args) {
        
        Student objStudent=new Student();
        objStudent.input();
        objStudent.output();
    }
}