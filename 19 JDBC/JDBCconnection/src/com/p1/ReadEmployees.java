package com.p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployees {

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
//		st.execute(query);
		 
		int status = st.executeUpdate("insert into students values(201,'sumit',58900);");
//		int status = st.executeUpdate("update students set name='Aman' where name='aakash';");
//		int status = st.executeUpdate("delete from students where name='aman';");
		
		if(status>0)
		{
			System.out.println("chal gaya");
		}
		else
		{
			System.out.println("nahi chala");
		}
	
		st.close();
		con.close();
		
		
	}

}
