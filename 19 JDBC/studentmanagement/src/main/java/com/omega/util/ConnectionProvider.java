package com.omega.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider 
{
    public static Connection getMySqlConnection()
    {
        Connection con=null;
        try 
        {
            //1.load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/Omega?createDatabaseIfNotExist=true";
            con=DriverManager.getConnection(url, "root", "1234");
            System.out.println("connected to database succesfully!");
        } 
        catch (ClassNotFoundException e) 
        {
            System.out.println("unable to load driver");
        }
        catch(SQLException s)
        {
            System.out.println("unable to connect with Database!! "+s.getLocalizedMessage());
        }
        return con;
    }
}
