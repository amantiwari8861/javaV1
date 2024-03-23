package com.omega;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider 
{
    public static Connection getMySqlConnection() 
    {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/";
        String db = "mydb?createDatabaseIfNotExist=true";
        String username = "root";
        String password = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url + db, username, password);
            System.out.println("connected to mysql succesfully!");
        } 
        catch (ClassNotFoundException cf) 
        {
            System.out.println("Driver not found :" + cf.getLocalizedMessage());

        } catch (SQLException se) 
        {
            System.out.println(se.getLocalizedMessage());
        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}
