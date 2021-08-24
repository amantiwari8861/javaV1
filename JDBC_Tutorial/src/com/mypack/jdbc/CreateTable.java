package com.mypack.jdbc;
import java.sql.*;
public class CreateTable {
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/JDBC";
		String uname="root";
		String pass="1234";
		String query="Create table UserInfo(userid int auto_increment primary key,username varchar(20),password varchar(20) ,authid int)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=null;
		Statement st=null;
			con=DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection Created !");
			st=con.createStatement();
			st.executeUpdate(query);//for DML
			System.out.println("Table Created Succesfully!");
			st.close();
			con.close();
	}
}
