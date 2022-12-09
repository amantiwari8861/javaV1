package com.mypack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//JDBC = Java Database Connectivity 
		//we are using mysql for now
		String url="jdbc:mysql://localhost:3306/JDBC";
		String uname="root";
		String pass="1234";
		String query="SELECT * FROM USER";
		Class.forName("com.mysql.jdbc.Driver");  //load and register the driver
//		Class.forName("com.mysql.cj.jdbc.Driver");  //new version
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);//for DQL only
//		rs.next();
		//String username=rs.getString("username");
//		String username=rs.getString(1);
//		String userid=rs.getString(2);
		//System.out.println("the userid is"+ userid+" username is :"+username+" the password is :"+rs.getString(3));
		
		while(rs.next())
		{
			System.out.println("the userid is "+rs.getString(1)+" username is :"+rs.getString(2)+" the password is :"+rs.getString(3));
		}
		
		st.close();
		con.close();
	}

}
