import java.util.Scanner;

class Student 
{
    int id;
    String name;
    String address;
    String schoolName="Xyz School";

    Student()
    {
        System.out.println("Default Constructor");
    }
    Student(int id1,String name1,String addr)
    {
        id=id1;
        name=name1;
        address=addr;
    }
    void showDetails()
    {
        System.out.println("============================================================");
        System.out.println("Id :"+id);
        System.out.println("name :"+name);
        System.out.println("address :"+address);
        System.out.println("school name :"+schoolName);
    }
}
public class StudentDetails 
{
    public static void main(String[] args) {
        
        // Scanner sc=new Scanner(System.in);
        // int id;
        // String name,address;
        // System.out.println("Enter ur id,name,address");
        // id=sc.nextInt();
        // sc.nextLine();
        // name=sc.nextLine();
        // address=sc.nextLine();

        Student s1=new Student();//calling default constructor
        System.out.println(s1.id);
        // Student s1=new Student(id,name,address);
        // s1.showDetails();

        // Student s1=new Student();
        // Student s2=new Student(100,"Dev","MP");
        // s2.showDetails();

    }
}