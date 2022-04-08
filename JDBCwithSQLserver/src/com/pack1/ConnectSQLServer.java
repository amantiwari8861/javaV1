package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSQLServer {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String url="jdbc:sqlserver://AMANDROID\\MSSQLSERVER2;databaseName=meraDatabase;";
		String url2="jdbc:sqlserver://localhost:1433;databaseName=meraDatabase;user=sa;password=Aman@8861";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con=DriverManager.getConnection(url,"sqlserverinstance","Aman@8861");
		
		System.out.println("connect success");
	}

}
