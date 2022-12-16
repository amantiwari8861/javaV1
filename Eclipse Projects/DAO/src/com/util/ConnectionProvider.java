package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider 
{
	private static Connection con = null;

	public static Connection getMysqlConnection() {
		String mysqlUrl = "jdbc:mysql://localhost:3306/stugre";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(mysqlUrl, "root", "1234");
			System.out.println("Succesfully connected! to mysql");
		} catch (ClassNotFoundException cf) {
			System.out.println("unable to load driver!");
			cf.printStackTrace();
		} catch (SQLException se) {
			System.out.println("sql exception occured");
			se.printStackTrace();
		}
		return con;
	}
}
