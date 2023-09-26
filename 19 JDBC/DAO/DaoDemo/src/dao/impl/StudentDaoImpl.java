package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dao.StudentDao;
import entities.Student;
import util.ConnectionProvider;

public class StudentDaoImpl implements StudentDao
{
    boolean isTableCreated;
    public StudentDaoImpl(){
        if (!isTableCreated) {
            createtable();
        }
    }
    private void createtable(){
        try {
            Connection con=ConnectionProvider.getMySqlConnection();
            Statement st=con.createStatement();
            st.execute("create table if not exists Students(rollno int primary key auto_increment,name varchar(255),fees float,skills varchar(255),gender char(1),mobileno bigint);");
            System.out.println("table created succesfully!!");
            isTableCreated=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean addStudent(Student student) {
        
        try {
            Connection con=ConnectionProvider.getMySqlConnection();
            PreparedStatement ps=con.prepareStatement("insert into students(name,fees,skills,gender,mobileno) values(?,?,?,?,?)");
            ps.setString(1, student.getName());
            ps.setFloat(2, student.getFees());
            ps.setString(3, Arrays.toString(student.getSkills()));
            ps.setString(4,String.valueOf(student.getGender()));
            ps.setLong(5, student.getMobileNo());
            System.out.println(ps);
            int rowsEffected=ps.executeUpdate();
            return (rowsEffected>0)?true:false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateStudent(Student newStudent){
        try 
        {
            Connection con=ConnectionProvider.getMySqlConnection();
            PreparedStatement ps=con.prepareStatement("update students set name=?,fees=?,skills=?,gender=?,mobileno=? where rollno=?; ");
            ps.setString(1, newStudent.getName());
            ps.setFloat(2, newStudent.getFees());
            ps.setString(3,Arrays.toString(newStudent.getSkills()));
            ps.setString(4,String.valueOf(newStudent.getGender()));
            ps.setLong(5, newStudent.getMobileNo());
            ps.setInt(6, newStudent.getRollNo());
            System.out.println(ps);
            return ps.executeUpdate()>0?true:false;
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return false;
   }

    @Override
    public boolean deleteStudentByRollNo(int rollNo) 
    {
        try {
            Connection con=ConnectionProvider.getMySqlConnection();
            PreparedStatement ps=con.prepareStatement("delete from students where rollno=?;");
            ps.setInt(1, rollNo);
            return ps.executeUpdate()>0?true:false;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Student getStudentByRollNo(int rollNo) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        
        try {
            Connection con=ConnectionProvider.getMySqlConnection();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from students;");
            List<Student> allStudents=new ArrayList<>();
            while (rs.next()) 
            {
                Student student=new Student();
                student.setRollNo(rs.getInt("rollno"));
                student.setName(rs.getString("name"));
                student.setFees(rs.getFloat("fees"));
                student.setGender(rs.getString("gender").charAt(0));
                student.setMobileNo(rs.getLong("mobileno"));

                String arr[]=rs.getString("skills").substring(1, rs.getString("skills").length()-1).split(",");
                
                student.setSkills(arr);
                allStudents.add(student);
            }
            return allStudents;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
    @Override
    public boolean deleteStudentByName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudentByName'");
    }
    
}
