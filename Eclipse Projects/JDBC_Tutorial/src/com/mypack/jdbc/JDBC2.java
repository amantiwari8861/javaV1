package com.mypack.jdbc;
import java.sql.*;
import java.util.Scanner;

public class JDBC2 {

	public static void main(String[] args) throws Exception 
	{
		System.out.println("enter the id username and password");
		Scanner sc=new Scanner(System.in);

		int authid=sc.nextInt();
		String name=sc.next();
		String pass=sc.next();
		String uid=sc.next();
		
		String query="insert into user values(?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection obj=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","1234");
		PreparedStatement ps=obj.prepareStatement(query);
			ps.setString(1, uid);
			ps.setString(2, name);
			ps.setString(3, pass);
			ps.setInt(4,authid);
		int status=ps.executeUpdate();
		
		System.out.println("rows affected :"+status);
		sc.close();
		obj.close();
	}
}
