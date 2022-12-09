package com.pack2;

import java.sql.DriverManager;

public class JdbcWithSqlServer {

	public static void main(String[] args) {

		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			DriverManager.getConnection("jdbc:sqlserver://localhost:1433;encrypt=true;user=sa;password=1234;")
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
