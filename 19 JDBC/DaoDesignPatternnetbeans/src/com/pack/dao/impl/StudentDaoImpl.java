package com.pack.dao.impl;

import com.pack.beans.Student;
import com.pack.dao.StudentDao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.pack.dao.ConnectionProvider;
import java.sql.ResultSet;

public class StudentDaoImpl implements StudentDao {

    private Connection con = null;

    @Override
    public boolean createTable() {
        con = ConnectionProvider.getMysqlConnection();
        try {
            Statement st = con.createStatement();
            boolean status = st.execute("if not exist create table megastudents(id int primary key auto_increment,"
                    + "name varchar(255),fees double,age int,phone bigint);");
            System.out.println("table created succesfully!");
            con.close();
            return status;
        } catch (SQLException ex) {
        }
        return false;
    }

    @Override
    public boolean addStudent(Student student) {
        con = ConnectionProvider.getMysqlConnection();
        

        String query = "insert into megastudents(name,age,fees,phone) values('" + name + "'," + age + "," + fees + "," + phone + ");";
        System.out.println(query);
        try {
            Statement st = con.createStatement();
            int status = st.executeUpdate(query);
            if (status > 0) {
                System.out.println("user added succesfully!");
            } else {
                System.out.println("Unable to add User!");
            }
            con.close();
        } catch (SQLException se) {
            System.err.println(se.getCause());
        }
    }

    @Override
    public boolean updateStudent(Student newstudent) {
        con = ConnectionProvider.getMysqlConnection();
        System.out.println("Enter id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.print("Enter age:");
        int age = sc.nextInt();
        System.out.print("Enter phone:");
        long phone = sc.nextLong();
        System.out.print("Enter fees:");
        double fees = sc.nextDouble();

        String query = "update megastudents set name='" + name + "',age=" + age + ",phone=" + phone + ",fees=" + fees + " where id=" + id + ";";
        System.out.println(query);
        try {
            Statement st = con.createStatement();
            int status = st.executeUpdate(query);
            if (status > 0) {
                System.out.println("user updated succesfully!");
            } else {
                System.out.println("Unable to update User!");
            }
            con.close();
        } catch (SQLException se) {

            se.printStackTrace();
        }
    }

    @Override
    public boolean deleteStudent(int id) {
        con = ConnectionProvider.getMysqlConnection();
        System.out.println("Enter id:");
        int id = sc.nextInt();

        String query = "delete from megastudents where id=" + id + ";";
        System.out.println(query);
        try {
            Statement st = con.createStatement();
            int status = st.executeUpdate(query);
            if (status > 0) {
                System.out.println("user deleted succesfully!");
            } else {
                System.out.println("Unable to delete User!");
            }
            con.close();
        } catch (SQLException se) {

            se.printStackTrace();
        }
    }

    @Override
    public void showStudents() 
    {
        con = ConnectionProvider.getMysqlConnection();

        String query = "select * from megastudents;";
//        System.out.println(query);
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            System.out.printf("%-8s %-20s %-20s %-20s %-20s \n", "Id", "Name", "Fees", "Age", "Phone");
            while (rs.next()) {
                System.out.printf("%-8d ", rs.getInt(1));
                System.out.printf("%-20s ", rs.getString(2));
                System.out.printf("%-20s ", rs.getDouble(3));
                System.out.printf("%-20s ", rs.getInt(4));
                System.out.printf("%-20s ", rs.getLong(5));
                System.out.println();
            }
            rs.close();
            st.close();

            con.close();
        } catch (SQLException se) {

            se.printStackTrace();
        }
    }
}