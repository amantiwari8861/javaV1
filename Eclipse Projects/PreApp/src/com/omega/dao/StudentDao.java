package com.omega.dao;
import java.sql.ResultSetMetaData;
import com.omega.entity.Student;
import java.util.List;
import java.sql.SQLException;

public interface StudentDao 
{
    int addStudent(Student student) throws SQLException;
    List<Student> getAllStudents();
    int updateStudent(Student student);
    int deleteStudent(int id);
    Student findStudentById(int id);
    Student findStudentByMobileNo(long mobileNo);
    int deleteStudentByMobileNo(long mobileNo);
    int updateStudentByMobileNo(long mobileNo);
    List<Student> findStudentByName(String name); // find all name like %s%      
    ResultSetMetaData getRSMD();
}
