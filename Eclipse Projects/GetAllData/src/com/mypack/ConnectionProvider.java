package com.mypack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionProvider {
	public static Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/";
		String dbname="jdbc";
		String uname="root";
		String pass="1234";	
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url+dbname,uname,pass);
		}
		catch(SQLException|ClassNotFoundException s)
		{
			System.out.println("unable to connect to database!");
			s.printStackTrace();
		}
		return con;
	}
}
