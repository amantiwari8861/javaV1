package com.mypack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GetAllUsers {

	public static ArrayList<StudentsData> getAllStudents() throws SQLException {

		String Query="select * from userinfo;";
		Connection con=ConnectionProvider.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(Query);
		
		ArrayList<StudentsData> udata=new ArrayList<StudentsData>();
		
		while(rs.next())
		{
			StudentsData stdata=new StudentsData();
			stdata.setUserid(rs.getString("userid"));
			stdata.setUsername(rs.getString("username"));
			stdata.setPassword(rs.getString("password"));
			stdata.setAuthid(rs.getInt("authid"));
			udata.add(stdata);
		}
		return udata;
	}

}
