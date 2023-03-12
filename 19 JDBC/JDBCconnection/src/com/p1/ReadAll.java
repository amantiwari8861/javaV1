package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadAll {


	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/";
		String db="megainstitute";
		String username="root";
		String pass="1234";
		String query="create table Students(id int,name varchar(50),fee float);";
		
		Connection con=DriverManager.getConnection(url+db,username,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from students;");
		
//		rs.next();
//		System.out.println(rs.getInt("id")+" "+rs.getString("name")+"  "+rs.getFloat("fee"));
		
		while (rs.next()) 
		{
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+"  "+rs.getFloat("fee"));
		}
		
		con.close();
		st.close();
		rs.close();
	}

}
