package com.pack1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection con=null;
		ConnectionProvider cp=new ConnectionProvider();
		con=cp.getMysqlConnection();
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");// dql
		
//		rs.next();
//		System.out.println("empid : "+rs.getString(1)+" empname :"+rs.getString("empname")+" empdetails:"+rs.getString(3));
//		rs.next();
//		System.out.println("empid : "+rs.getString(1)+" empname :"+rs.getString("empname")+" empdetails:"+rs.getString(3));
		
		while(rs.next())
		{
			System.out.println("empid : "+rs.getString(1)+" empname :"+rs.getString("empname")+" empdetails:"+rs.getString(3));	
		}
	}

}
