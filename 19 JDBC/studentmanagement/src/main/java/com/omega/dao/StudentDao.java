package com.omega.dao;

import java.util.List;

import com.omega.entities.Student;


public interface StudentDao {

    boolean addStudent(Student student);
    boolean updateStudent(Student newStudent);
    boolean deleteStudentByRollNo(int rollNo);
    Student getStudentByRollNo(int rollNo);
    List<Student> getAllStudents();
    boolean deleteStudentByMobileNo(Long mobileNo);    
    List<String> getAllColumnsName();
}
