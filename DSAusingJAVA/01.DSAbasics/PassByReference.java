class Institute
{
   void changeStudentData(Student student)//here the 
   {
        System.out.println("in changeStudentData method :"+student);
        student.setId(101);
        student.setName("Aman");
        student.setFees(40000);
        student.setPhone(9891062743l);
   }
}
public class PassByReference 
{
    public static void main(String[] args) 
    {
        Student student=new Student();
        System.out.println("in main method :"+student);
        Institute i=new Institute();
        i.changeStudentData(student);

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getFees());
        System.out.println(student.getPhone());
    }   
}
