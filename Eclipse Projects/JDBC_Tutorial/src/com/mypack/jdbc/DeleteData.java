package com.mypack.jdbc;

import java.sql.*;

public class DeleteData {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/JDBC";
		String uname="root";
		String pass="1234";
//		String query="delete from userinfo where username='Aman Tiwari'";
		String query="delete from userinfo where userid=2";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=null;
		Statement st=null;
			con=DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection Created !");
			st=con.createStatement();
			st.executeUpdate(query);
			System.out.println("Data Deleted Succesfully!");
			st.close();
			con.close();
	}

}
