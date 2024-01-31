import java.util.Scanner;

class Student
{
    int rollNo;
    String name;
    String address;
    long mobileno;

    void inputDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter ur rollno :");
        rollNo=sc.nextInt();
        sc.nextLine();
        System.out.print("enter ur name :");
        name=sc.nextLine();
        System.out.print("enter ur address :");
        address=sc.nextLine();
        System.out.print("enter ur mobileno :");
        mobileno=sc.nextLong();
    }
    void showStudentDetails()
    {
        System.out.println("---------Student Details is -----------------------");
        System.out.println("Student Roll No. "+rollNo);
        System.out.println("Student Name "+name);
        System.out.println("Student Address "+address);
        System.out.println("Student Mobile no. "+mobileno);
    }
}
public class StudentHandler {

    public static void main(String[] args) {
        
        // int num=10;
        //primitive data type int 

        // Student stu=new Student();//class is also a user-defined data type
        // //Non-primitive data-type
        // stu.name="Satish";
        // stu.address="noida";
        // System.out.println(stu.name+" lives in "+stu.address);

        // stu.inputDetails();
        // stu.showStudentDetails();

        // Student stu2=new Student();
        // stu2.inputDetails();
        // stu2.showStudentDetails();

        Student stuArr[]=new Student[500];
        // int numArr[]=new int[100];

        for (int i = 0; i < 2; i++) 
        {
            System.out.println("******Enter the Data of Student "+(i+1)+" **********");
            Student temp=new Student();
            temp.inputDetails();
            stuArr[i]=temp;
        }
        System.out.println("All Students details are:");
        for (int i = 0; i < 2; i++) 
        {
            stuArr[i].showStudentDetails();
        }
    }
}