package com.mypack.JDBCbasic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCbasics {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.
				getConnection("jdbc:mysql://localhost:3306/mydatabase","root","1234");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from products");
		
//		rs.next();
//		
//		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
//		
//		rs.next();
//		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
//		rs.next();
//		System.out.println(rs.getString("product_name"));
//		rs.next();
//		System.out.println(rs.getString("product_name"));
		
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
	}

}
