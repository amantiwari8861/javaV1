package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//Class.forName("com.mysql.jdbc.Driver"); //old Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver"); //New Driver Class
		System.out.println("Driver loaded !");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
		System.out.println("Connection Created !");
	
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from users where username='admin';");
		
//		rs.next();
//		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//		rs.next();
//		System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//		rs.next();
//		System.out.println(rs.getString("username")+" "+rs.getString("password")+" "+rs.getString("role"));
//		
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		
		con.close();
	}

}
