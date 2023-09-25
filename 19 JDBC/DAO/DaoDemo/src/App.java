import java.util.List;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import entities.Student;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        StudentDao dao=new StudentDaoImpl();
        // boolean status=dao.addStudent(new Student("Mohit", 200000, new String[]{"C","HTML","JAVA"}, 'M', 9891062743L));
        // if (status) {
        //     System.out.println("student added succesfully!!!");
        // } else {
        //     System.out.println("unable to add student!!");
        // }
        List<Student> allStudents=dao.getAllStudents();
        for (int i = 0; i < allStudents.size(); i++) 
        {
            // System.out.println(allStudents.get(i));
            System.out.println("=========================================================");
            Student student=allStudents.get(i);
            System.out.println("Roll No :"+student.getRollNo());
            System.out.println("Name :"+student.getName());
            System.out.println("Fees :"+student.getFees());
            System.out.println("Skills :");
            for (String skill : student.getSkills()) 
            {
                System.out.print("\t"+skill);
            }
            System.out.println("\nGender :"+student.getGender());
            System.out.println("MobileNo :"+student.getMobileNo());
        }
    }
}