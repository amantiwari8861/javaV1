package com.mypack.jdbc;

import java.sql.*;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);
		String name[]=new String[3];
		String pass[]=new String[3];
		String uid[]=new String[3];
		int authid[]=new int[3];
		int i=0;
		while(i<3) {
		System.out.println("enter the authid ,username,password and authid of "+(i+1));
		authid[i]=sc.nextInt();
		name[i]=sc.next();
		pass[i]=sc.next();
		uid[i]=sc.next();
		i++;
		}
		//i=3
		String query="insert into user values(?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection obj=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","1234");
//		obj.setAutoCommit(false);
		PreparedStatement ps=obj.prepareStatement(query);
		int j=0;
			while(j<3) {
				ps.setString(1, uid[j]);
				ps.setString(2, name[j]);
				ps.setString(3, pass[j]);
				ps.setInt(4,authid[j]);
				j++;
				ps.addBatch();
			}
			int status[]=ps.executeBatch();
//			obj.commit();
		for(int stat:status) {
		System.out.println("rows affected :"+stat);
		}
		sc.close();
		obj.close();
	}
}

//crud  




