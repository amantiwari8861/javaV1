package com.pack1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	Connection con=null;
	public Connection getMysqlConnection() throws SQLException, ClassNotFoundException
	{
		//Class.forName("com.mysql.jdbc.Driver");//old
		Class.forName("com.mysql.cj.jdbc.Driver");//new 
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","1234");
		System.out.println("connected to mysql");
		return con;
	}
	public void getSQLServerConnection() throws ClassNotFoundException, SQLException
	{
		String url2 = "jdbc:sqlserver://localhost:1433;databaseName=feb2022;user=sa;password=Aman@8861;encrypt=true;trustServerCertificate=true;";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con=DriverManager.getConnection(url2);
		System.out.println("connected to sql server");
		
		//String url = "jdbc:sqlserver://suraj\\HEMANTSQL;databaseName=feb2022;";
		//Connection con2 = DriverManager.getConnection(url, "sa", "Aman@8861");
		//Open SQL Server Configuration Manager, and then expand SQL Server 2012 Network Configuration.
		//Click Protocols for InstanceName, and then make sure TCP/IP is enabled in the right panel and double-click TCP/IP.
		//On the Protocol tab, notice the value of the Listen All item.
		//Click the IP Addresses tab: If the value of Listen All is yes, the TCP/IP port number for this instance of
		//SQL Server 2012 is the value of the TCP Dynamic Ports item under IPAll. If the value of Listen All is no,
		//the TCP/IP port number for this instance of SQL Server 2012 is the value of the TCP Dynamic Ports item for a specific IP address.
		//Make sure the TCP Port is 1433.
		//Click OK.
	}
}
