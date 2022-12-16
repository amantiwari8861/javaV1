package com.main;

import com.bean.Student;
import com.dao.StudentDao;
import com.daoimpl.StudentDaoImpl;

public class DaoDemo {

	public static void main(String[] args) {

		Student s1 = new Student(21, "AMan", 9891062743l, 2.47);

		StudentDao studao = new StudentDaoImpl();

		boolean status = studao.add(s1);

		if (status) {
			System.out.println("Student added succesfully !");
		} else {
			System.out.println("Student data not saved !");

		}

	}

}
