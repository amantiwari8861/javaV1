//package preapp;
//
//import com.omega.dao.StudentDao;
//import com.omega.dao.impl.StudentDaoImpl;
//import com.omega.entity.Student;
//import java.io.IOException;
//import java.util.List;
//import java.util.Scanner;
//
//
//public class PreApp {
//
//    private static final Scanner sc;
//    private static final StudentDao dao;
//
//    static {
//        sc = new Scanner(System.in);
//        dao = new StudentDaoImpl();
//    }
//
//    public static Student getStudent() {
//        Student student = new Student();
//        System.out.print("Enter id :");
//        student.setStudId(sc.nextInt());
//        sc.nextLine();
//        System.out.print("Enter Student Name :");
//        student.setName(sc.nextLine());
//        System.out.print("Enter phone no :");
//        student.setPhoneNo(sc.nextLong());
//        System.out.print("Enter fees :");
//        student.setFee(sc.nextDouble());
//        System.out.print("is married :");
//        student.setIsMarried(sc.nextBoolean());
//        System.out.print("gender :");
//        student.setGender(sc.next().charAt(0));
//        return student;
//    }
//
//    public static void main(String[] args) throws IOException,InterruptedException
//    {
//
////        Connection con=ConnectionProvider.getMySqlConnection();
////        Student stu=new Student(101, "Avinash", 9889989898L, 20000.5, true, 'M');
////        int status=dao.addStudent(stu);
////        if(status>0)
////        {
////            System.out.println("user added succesfully!!");
////        }
////        List<Student> students=dao.getAllStudents();
////        for(int i=0;i<students.size();i++)
////        {
//////            System.out.println(students.get(i));
////            Student student=students.get(i);
////            System.out.println("Student Id :"+student.getStudId());
////        }
//        do {
////            System.out.print("\033[H\033[2J");  
////            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
////            System.out.print("\033\143");
//            
//            System.out.println("1.Add Student ");
//            System.out.println("2.List All Student ");
//            System.out.println("3.Update Student ");
//            System.out.println("4.Delete Student record");
//            System.out.println("5.Get Student by id");
//            System.out.println("0.exit");
//            System.out.print("Enter ur choice:");
//            int choice = sc.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter new Student Detail");
//                    Student stu = getStudent();
//                    dao.addStudent(stu);
//                    System.out.println("Student added Succesfully!");
//                    break;
//                case 2:
//                    System.out.println("********** List Of All Students *********");
//                    List<Student> students = dao.getAllStudents();
//                    for (int i = 0; i < students.size(); i++) 
//                    {
//                        System.out.println(students.get(i));
////                        Student student1 = students.get(i);
////                        System.out.println("Student Id :" + student1.getStudId());
//                    }
//                    break;
//                case 3:
//                    System.out.println("Enter Student's new Details:");
//                    Student student2 = getStudent();
//                    dao.updateStudent(student2);
//                    System.out.println("Student updated succesfully!");
//                    break;
//                case 4:
//                    System.out.print("Enter Student id to be deleted:");
//                    dao.deleteStudent(sc.nextInt());
//                    System.out.println("Student deleted succesfully!");
//                    break;
//                case 5:
//                    System.out.print("Enter Student id to be searched:");
//                    Student stu1=dao.findStudentById(sc.nextInt());
//                    if(stu1!=null)
//                        System.out.println(stu1);
//                    break;
//                case 0:
//                    System.out.println("Thank you!!");
//                    System.exit(0);
//                default:
//                    System.out.println("invalid input");
//            }
//        } while (true);
//
//    }
//}
