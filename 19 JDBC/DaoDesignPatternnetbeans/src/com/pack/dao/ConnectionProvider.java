package com.pack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    public static Connection getMysqlConnection()
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/";
            String db="jdbc";
            String uname="root";
            String pass="1234";
            Connection con=DriverManager.getConnection(url+db,uname,pass);
//            System.out.println("Succesfully connected to database!");
            return con;
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println("unable to load driver");
        } 
        catch (SQLException ex) 
        {
            System.out.println("Sql Error :"+ex.getMessage());
        }
        
        return null;
    }

    
}

