package com.omega.dao.impl;

import java.sql.ResultSetMetaData;
import com.omega.ConnectionProvider;
import com.omega.dao.StudentDao;
import com.omega.entity.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private ResultSetMetaData rsmd=null;
    @Override
    public int addStudent(Student student) throws SQLException {
        int rowsAffected = 0;
        Connection con = ConnectionProvider.getMySqlConnection();
        PreparedStatement ps = con.prepareStatement("insert into Student values(?,?,?,?,?,?);");
        ps.setInt(1, student.getStudId());
        ps.setString(2, student.getName());
        ps.setLong(3, student.getPhoneNo());
        ps.setDouble(4, student.getFee());
        ps.setBoolean(5, student.isIsMarried());
        ps.setString(6, String.valueOf(student.getGender()));
        rowsAffected = ps.executeUpdate();
        ps.close();
        con.close();
        return rowsAffected;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentsList = new ArrayList<>();

        try (Connection con = ConnectionProvider.getMySqlConnection(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery("select * from student;");) {
            
            rsmd= rs.getMetaData();
            
            while (rs.next()) {
                Student student = new Student();
                student.setStudId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setPhoneNo(rs.getLong(3));
                student.setFee(rs.getDouble(4));
                student.setIsMarried(rs.getBoolean(5));
                student.setGender(rs.getString(6).charAt(0));
                studentsList.add(student);
            }
            return studentsList;
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return studentsList;
    }

    @Override
    public int updateStudent(Student student) {

        int rowsAffected = 0;
        try {
            Connection con = ConnectionProvider.getMySqlConnection();
            PreparedStatement ps = con.prepareStatement("update student set name=?,phoneno=?,fees=?,ismarried=?,gender=? where stuid=?;");
            ps.setString(1, student.getName());
            ps.setLong(2, student.getPhoneNo());
            ps.setDouble(3, student.getFee());
            ps.setBoolean(4, student.isIsMarried());
            ps.setString(5, String.valueOf(student.getGender()));
            ps.setInt(6, student.getStudId());
            rowsAffected = ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rowsAffected;
    }

    @Override
    public int deleteStudent(int id) {
        int rowsAffected = 0;
        try {
            Connection con = ConnectionProvider.getMySqlConnection();
            PreparedStatement ps = con.prepareStatement("delete from student where stuid=?;");
            ps.setInt(1, id);
            rowsAffected = ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rowsAffected;
    }

    @Override
    public Student findStudentById(int id) {

        Student student = new Student();
        try (Connection con = ConnectionProvider.getMySqlConnection(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery("select * from student where stuid=" + id + ";");) {
            rs.next();
            student = new Student();
            student.setStudId(rs.getInt(1));
            student.setName(rs.getString(2));
            student.setPhoneNo(rs.getLong(3));
            student.setFee(rs.getDouble(4));
            student.setIsMarried(rs.getBoolean(5));
            student.setGender(rs.getString(6).charAt(0));
            return student;
        } catch (SQLException se) {
            System.out.println("Student Record Doesn't Exist!");
            return null;
//            se.printStackTrace();
        }
    }

    @Override
    public Student findStudentByMobileNo(long mobileNo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int deleteStudentByMobileNo(long mobileNo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int updateStudentByMobileNo(long mobileNo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Student> findStudentByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ResultSetMetaData getRSMD()
    {
        return rsmd;
    }
}

// create table student(stuid int primary key auto_increment,
//name varchar(255),phoneno bigint,fees double,ismarried bool,
//gender char(1));
