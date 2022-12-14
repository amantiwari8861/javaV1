package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTutorial {

	public static void main(String[] args) {
		
		String mysqlUrl="jdbc:mysql://localhost:3306/stugre";
		
		//JDBC :  type 4 driver
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection mysqlcon = DriverManager.getConnection(mysqlUrl,"root","1234");
			System.out.println("Connected succesfully!!");
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("driver class not found! or sql exception occured ");
			e.printStackTrace();
		}
		
	}

}
