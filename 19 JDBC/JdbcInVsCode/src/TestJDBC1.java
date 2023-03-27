// package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC1 {

	public static void main(String[] args) 
	{
		//Load the driver
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Unable to load mysql driver");
			e.printStackTrace();
		}
//		A JDBC driver is a software component enabling a Java application
//		to interact with a database.
//		JDBC requires drivers for each database.
		String url="jdbc:mysql://localhost:3306/";
		String db="megainstitute";
		String username="root";
		String pass="1234";
		try 
		{
			Connection con=DriverManager.getConnection(url+db,username,pass);
		
		} 
		catch (SQLException e) 
		{
			System.out.println("Unable to connect with mysql");
			e.printStackTrace();
		}
		
		System.out.println("Connection Succesfully");		
	}

}
