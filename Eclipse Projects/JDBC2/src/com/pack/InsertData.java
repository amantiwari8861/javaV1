package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","1234");
//		PreparedStatement ps=con.prepareStatement("insert into userinfo values(201,'sujata','choudhary',302);");
		//PreparedStatement ps=con.prepareStatement("delete from userinfo where username='sujata';");
		//PreparedStatement ps=con.prepareStatement("update userinfo set username='anjali' where username='sunidhi';");
		PreparedStatement ps=con.prepareStatement("create table CenterData(roll int,name varchar(30));");
		PreparedStatement ps2=con.prepareStatement("insert into centerdata values(21,'sujata');");

		
		ps.executeUpdate();
		int status2=ps2.executeUpdate();
		
		if(status2==1)
		{
			System.out.println("data inserted succesfully");
		}
		else {
			System.out.println("data not inserted");
		}
	}

}
