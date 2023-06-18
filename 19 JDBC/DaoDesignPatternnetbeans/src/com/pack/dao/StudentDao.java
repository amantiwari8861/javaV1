package com.pack.dao;

import com.pack.beans.Student;

public interface StudentDao 
{
    boolean createTable();
    boolean addStudent(Student student);
    boolean updateStudent(Student newstudent);
    boolean deleteStudent(int id);
    void showStudents();           
}