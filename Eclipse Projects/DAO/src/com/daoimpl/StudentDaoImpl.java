package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.bean.Student;
import com.dao.StudentDao;
import com.util.ConnectionProvider;

public class StudentDaoImpl implements StudentDao
{

	Connection con=ConnectionProvider.getMysqlConnection();
	@Override
	public boolean add(Student s) {
		int status=0;
		try {
			String query="insert into student3(name,mobile,fees) values(?,?,?);";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, s.getName());
			stmt.setLong(2, s.getMobile());
			stmt.setDouble(3, s.getFees());
			status=stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status>0 ? true : false;
	}

}
