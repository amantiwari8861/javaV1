package com.pack.logic;

import java.util.ArrayList;
import java.util.Collection;
import com.pack.beans.Employee;
public class MeraCollection {
	public static void main(String[] args) {
//		Collection col=new ArrayList();
//		col.add("hello");
//		col.add(10);
//		col.add(20.5);
//		
//		Employee e1=new Employee(101, "Anjali");
//		
//		col.add(e1);
//		for (Object object : col) {
//			System.out.println(object);
//			System.out.println(object.getClass().getName());
//			
//		}
//		Collection col2=new ArrayList();
//		Collection<Employee> col2=new ArrayList<>();//diamond operator
//		col2.add(new Employee(102,"ritik"));
//		col2.add(new Employee(103,"sourabh"));
//		col2.add(new Employee(104,"kamal"));
//		col2.add(106,"subham"); error
//		for (Object object : col2) {
//			System.out.println(object);
//		}
//		for (Employee emp : col2) {
//			System.out.println("id = "+emp.getEmpid()+"Name = "+emp.getEmpname());
//		}
//		col2.stream().forEach(emp->{
//			col2.forEach(emp->{
//			System.out.println("id = "+emp.getEmpid()+"Name = "+emp.getEmpname());
//		});
//		
		Employee emp[]=new Employee[5];
		
		for (int i = 0; i < emp.length; i++) {
			emp[i]=new Employee(i," ritik ".concat(String.valueOf(i)));
		}
	
		for (int i = 0; i < emp.length; i++) {
			System.out.println("Name : "+emp[i].getEmpname()+" id :"+emp[i].getEmpid());
		}
		
	}

}
