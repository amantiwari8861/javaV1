package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTutorial {
	public static void main(String[] args) {
		
		Connection con1=ConnectionProvider.getMysqlConnection();
		System.out.println("succesfully got mysql connection in main ");

//		Connection con2=ConnectionProvider.getSqlServerConnection();
//		System.out.println("succesfully got sqlserver connection in main ");
		
		try {
			String query="create table student3("
					+ "id int primary key auto_increment,"
					+ "name varchar(255),"
					+ "mobile bigint,"
					+ "fees float);";
			Statement stmt = con1.createStatement();
			 stmt.execute(query);

			System.out.println("table created!");
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
}
}
