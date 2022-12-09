package com.mypack.jdbc;
import java.sql.*;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String uname[]=new String[3];
		String pass[]=new String[3];
		int authid[]=new int[3];
		int i=0;
		while(i<3) {
		System.out.println("enter the username,password and authid of "+(i+1));
		uname[i]=sc.next();
		pass[i]=sc.next();
		authid[i]=sc.nextInt();
		i++;
		}
		String query="insert into userinfo(username,password,authid) values(?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection obj=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","1234");
		PreparedStatement ps=obj.prepareStatement(query);
		int j=0;
			while(j<3) {
				ps.setString(1, uname[j]);
				ps.setString(2, pass[j]);
				ps.setInt(3,authid[j]);
				j++;
				ps.addBatch();
			}
			int status[]=ps.executeBatch();
		for(int stat:status) {
		System.out.println("rows affected :"+stat);
		}
		sc.close();
		ps.close();
		obj.close();		
	}
}