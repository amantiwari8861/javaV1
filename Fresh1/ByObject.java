import java.util.Scanner;
class Student
{
    String name;
    int marks;
    int rollno;
    public void output() {
        System.out.println("the student name is "+name+" marks is "+marks+" rollno is "+rollno);
    }
}
public class ByObject {
    public static void main(String[] args) {
        
        Student objStudent=new Student();
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the values ");
        objStudent.name=obj.nextLine();
        objStudent.marks=obj.nextInt();
        objStudent.rollno=obj.nextInt();
        obj.close();

        objStudent.output();
    }
}