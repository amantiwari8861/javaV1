package com.mypack.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ReadData {

	public static void main(String[] args) throws ClassNotFoundException , SQLException
	{
		String url="jdbc:mysql://localhost:3306/JDBC";
		String uname="root";
		String pass="1234";
		String query="SELECT * FROM userinfo";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		System.out.println("connection Created !");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query); //DQL
		//executeQuery --> DQL (select)
		//executeUpdate --> DDL (insert update delete alter etc)
		while(rs.next())
		{
//			System.out.println("the userid is "+rs.getString(1));
//			System.out.println("the username is "+rs.getString(2));
//			System.out.println("the password is "+rs.getString(3));
//			System.out.println("the authid is "+rs.getInt(4));
			System.out.println("userid : "+rs.getString("userid")+"  | username:"+rs.getString("username"));
			System.out.println("password :"+rs.getString("password")+"  |  authid :"+rs.getInt("authid"));
			System.out.println("-------------------------------------------------------");
		}
		st.close();
		con.close();
	}

}
