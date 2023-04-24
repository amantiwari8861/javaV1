package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionProvider 
{
	private Connection connection=null;

	public void getMySqlConnection()
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("unable to load driver");
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/";
		String db="amandb";
		String uname="root";
		String pass="1234";
		
		try 
		{
			connection = DriverManager.getConnection(url+db,uname,pass);
			System.out.println("Connection Successfully!");
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void showEmpData()
	{
		try 
		{
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from emp;");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
