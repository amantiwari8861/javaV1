package com.mypack.jdbc;

import java.sql.*;

public class UpdateData {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/JDBC";
		String uname="root";
		String pass="1234";
		String query="update userinfo set username='Aman Tiwari' where username='aman'";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=null;
		Statement st=null;
			con=DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection Created !");
			st=con.createStatement();
			st.executeUpdate(query);
			System.out.println("Data Updated Succesfully!");
			st.close();
			con.close();
	}

}
