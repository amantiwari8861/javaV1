package com.omega;

import java.io.Console;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.omega.dao.StudentDao;
import com.omega.dao.impl.StudentDaoImpl;
import com.omega.entities.Student;

public class App {
    private static Scanner sc = new Scanner(System.in);

    private static Student getStudentData() {
        Student student = new Student();
        System.out.print("Enter Roll No :");
        student.setRollNo(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Name:");
        student.setName(sc.nextLine());
        System.out.print("Enter Fees :");
        student.setFees(sc.nextFloat());
        System.out.print("Enter Gender :");
        sc.nextLine();
        student.setGender(sc.next().charAt(0));
        System.out.print("Enter Mobile No :");
        student.setMobileNo(sc.nextLong());
        sc.nextLine();
        System.out.print("Enter Skills(separated with ,) :");
        student.setSkills(sc.nextLine().split(","));

        student.setRecordCreated(new Date().toString());
        return student;
    }
    private static void printAllStudentData(List<Student> students,List<String> columns)
    {
        System.out.println("List Of All Students!!");
        
            System.out.printf("%-10s",columns.get(0));
            System.out.printf("%-20s",columns.get(1));
            System.out.printf("%-15s",columns.get(2));
            System.out.printf("%-30s",columns.get(3));
            System.out.printf("%-8s",columns.get(4));
            System.out.printf("%-13s",columns.get(5));
            System.out.printf("%-20s",columns.get(6));
        
        System.out.println("\n=====================================================================================================================================");
        for (Student student : students) 
        {
            System.out.printf("%-10s",student.getRollNo());
            System.out.printf("%-20s",student.getName());
            System.out.printf("%-15s",student.getFees());
            System.out.printf("%-30s",Arrays.toString(student.getSkills()));
            System.out.printf("%-8s",student.getGender());
            System.out.printf("%-13s",student.getMobileNo());
            System.out.printf("%-20s",student.getRecordCreated());
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception 
    {
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String PURPLE = "\u001B[35m";
        String CYAN = "\u001B[36m";
        String WHITE = "\u001B[37m";

        StudentDao dao = new StudentDaoImpl();
        Console console = System.console();
        if (console == null) {
            System.out.println("Console not available");
            System.exit(1);
        }

        int choice;
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println(BLUE+"1.Add Student!");
            System.out.println("2.Edit Student Data!");
            System.out.println("3.Delete Student Data!");
            System.out.println("4.Find Student by Roll No!");
            System.out.println("5.Get All Students Data!");
            System.out.println("6.Delete Student By mobileNo!");
            System.out.println("7.Exit"+RESET);

            System.out.print("Enter ur choice :");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student data to be Added!!");
                    dao.addStudent(getStudentData());
                    break;
                case 2:
                    System.out.println("Enter student data to be Updated!!");
                    dao.updateStudent(getStudentData());
                    break;
                case 3:
                    System.out.println("Enter student roll No to be deleted!!");

                    dao.deleteStudentByRollNo(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Enter student roll No to be searched!!");
                    dao.getStudentByRollNo(sc.nextInt());
                    break;
                case 5:

                    List<Student> allStudents = dao.getAllStudents();
                    List<String> columns=dao.getAllColumnsName();
                    printAllStudentData(allStudents,columns);
                    break;
                case 6:
                    Student student = dao.getStudentByRollNo(sc.nextInt());
                    System.out.println(student);
                    break;
                case 7:
                    System.out.println("Thankyou Visit Again!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            console.readPassword("Press enter to continue.......");
        } while (true);
    }
}

/*
 * 
 * 
 * Console console = System.console();
        if (console == null) {
            System.out.println("Console not available");
            System.exit(1);
        }

        char[] passwordArray = console.readPassword("Enter your password: ");
        String password = new String(passwordArray);

        System.out.println("You entered: " + password);
 */