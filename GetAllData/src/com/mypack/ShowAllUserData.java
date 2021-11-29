package com.mypack;

import java.sql.SQLException;
import java.util.ArrayList;

public class ShowAllUserData {

	public static void main(String[] args) throws SQLException {

		ArrayList<StudentsData> obj2=new ArrayList<StudentsData>();
		//it behaves like the database for my java
		obj2=GetAllUsers.getAllStudents();
		
		for (StudentsData studentsData : obj2) {
			System.out.println("------------------------------------------");
			System.out.println(studentsData.getUserid()+" "+studentsData.getAuthid());
			System.out.println(studentsData.getUsername()+" "+studentsData.getPassword());
		}
	}
}
