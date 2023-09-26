package dao;

import java.util.List;

import entities.Student;

public interface StudentDao {

    boolean addStudent(Student student);
    boolean updateStudent(Student newStudent);
    boolean deleteStudentByRollNo(int rollNo);
    Student getStudentByRollNo(int rollNo);
    List<Student> getAllStudents();
    boolean deleteStudentByName(String name);    
}
