class Institute
{
   public Student getStudent()//here the 
   {
        Student student=new Student();
        System.out.println("in getStudent method :"+student);
        student.setId(101);
        student.setName("Aman");
        student.setFees(40000);
        student.setPhone(9891062743l);
        return student;
   }
}
public class Covarient 
{
    public static void main(String[] args) 
    {
        Student stu;
        Institute i=new Institute();
        stu=i.getStudent();
        System.out.println("in main method :"+stu);
        System.out.println(stu.getId());
        System.out.println(stu.getName());
        System.out.println(stu.getFees());
        System.out.println(stu.getPhone());

    }
}