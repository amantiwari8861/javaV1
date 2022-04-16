package com.pack1;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ConnectionProvider cp=new ConnectionProvider();
		Connection con=cp.getMysqlConnection();
		
		Statement st1=con.createStatement();
		
//		int rs=st1.executeUpdate("insert into employee(empname,empsalary) values('Aman3',10000);");
//		int rs=st1.executeUpdate("update employee set empname='Aman2' where id=2;");
//		int rs=st1.executeUpdate("delete from employee where id=2;");
		int rs=st1.executeUpdate("create table meritable(id int,name varchar(50));");
		
		if(rs>0)
		{
			System.out.println("table created successfully !");
		}
		else
		{
			throw new SQLException();
		}
	}

}
