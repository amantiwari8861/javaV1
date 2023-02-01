//static is a modifier
class Student  // static modifier not allowed here (at Outer class)
{
    String name;
    static String schoolName = "Niit";//same for all the students (only 1 time memory allocation)
    // String schoolAddress;
    // if we use static then we can't initialize the static variables in non-static method or constructor
    static String schoolAddress; 
    // static //static block
    // {
    //     schoolAddress = "sector 18 noida";
    // }
    // Student() // static modifier not allowed here
    // {
    //     schoolAddress = "noida sector 62";//we can't initialize the static variable here (won't give error)
    // }
    static void changeSchoolAddress() //static method
    {
        schoolAddress="connaught palace";
    } 
}
public class StaticVariable 
{
    public static void main(String[] args) 
    {
        // Student s=new Student();
        // System.out.println(s.schoolName);
        // s.changeSchoolAddress();
        // System.out.println(s.schoolAddress);
        
        //Static method or variables are related to class not object so we can access static members directly by class name
        System.out.println(Student.schoolName);
        Student.changeSchoolAddress();
        System.out.println(Student.schoolAddress);

    }
}
