import java.util.List;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import entities.Student;
import util.ConnectionProvider;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        // Student s=new Student();
        // s.setName("prince");
        // s.setSkills(new String[]{"HTML","CSS","JAVA","C"});
        // System.out.println(s);
        // ConnectionProvider.getMySqlConnection();
        StudentDao dao=new StudentDaoImpl();
        // boolean status=dao.addStudent(new Student("Harsh", 200000, new String[]{"C","HTML","JAVA"}, 'M', 9891062743L));
        // if (status) {
        //     System.out.println("student added succesfully!!!");
        // } else {
        //     System.out.println("unable to add student!!");
        // }

        // List<Student> allStudents=dao.getAllStudents();
        // allStudents.forEach(student->System.out.println(student));
        // for (int i = 0; i < allStudents.size(); i++) 
        // {
        //     // System.out.println(allStudents.get(i));
        //     System.out.println("=========================================================");
        //     Student student=allStudents.get(i);
        //     System.out.println("Roll No :"+student.getRollNo());
        //     System.out.println("Name :"+student.getName());
        //     System.out.println("Fees :"+student.getFees());
        //     System.out.println("Skills :");
        //     for (String skill : student.getSkills()) 
        //     {
        //         System.out.print("\t"+skill);
        //     }
        //     System.out.println("\nGender :"+student.getGender());
        //     System.out.println("MobileNo :"+student.getMobileNo());
        // }
        // boolean status=dao.updateStudent(new Student(1, "shivank goel",80000, new String[]{"C","JAVA","Postgres SQL","HTML"}, 'M', 9891062743L));

        // if (status) {
        //     System.out.println("student data updated succesfully!!");
        // } else {
        //     System.out.println("unable to add student data !!");
        // }
        // boolean status=dao.deleteStudentByRollNo(1);
        // if (status) {
        //     System.out.println("student deleted succesfully !!");
        // } else {
        //     System.out.println("unable to delete student!!");
        // }
    }
}