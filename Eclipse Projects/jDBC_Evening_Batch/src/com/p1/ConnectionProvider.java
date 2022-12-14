package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
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

	public static Connection getSqlServerConnection() {
		String url2 = "jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks2017;encrypt=true;trustServerCertificate=true;";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url2, "sa", "test1234");
			System.out.println("Succesfully connected! to sqlserver");
		} catch (ClassNotFoundException cf) {
			System.out.println("unable to load driver!");
			cf.printStackTrace();
		} catch (SQLException se) {
			System.out.println("sql exception occured");
			se.printStackTrace();
		}
		return con;
		// String url ="jdbc:sqlserver://suraj\\HEMANTSQL;databaseName=feb2022;encrypt=true;trustServerCertificate=true;";
		// Connection con2 = DriverManager.getConnection(url, "sa", "Aman@8861");
		// Open SQL Server Configuration Manager, and then expand SQL Server 2012
		// Network Configuration.
		// Click Protocols for InstanceName, and then make sure TCP/IP is enabled in the
		// right panel and double-click TCP/IP.
		// On the Protocol tab, notice the value of the Listen All item.
		// Click the IP Addresses tab: If the value of Listen All is yes, the TCP/IP
		// port number for this instance of
		// SQL Server 2012 is the value of the TCP Dynamic Ports item under IPAll. If
		// the value of Listen All is no,
		// the TCP/IP port number for this instance of SQL Server 2012 is the value of
		// the TCP Dynamic Ports item for a specific IP address.
		// Make sure the TCP Port is 1433.
		// Click OK.
	}

}
