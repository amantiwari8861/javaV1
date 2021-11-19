package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccessData1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","1234");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from userinfo;");
		
		while (rs.next()) {
			System.out.println(rs.getInt("userid")+" "+rs.getString("username")+" "+rs.getString("password")+" "+rs.getInt("authid"));
		}
	}
}
