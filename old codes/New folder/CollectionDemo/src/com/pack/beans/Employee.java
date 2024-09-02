package com.pack.beans;

public class Employee {

	private int empid;
	private String empname;
	public Employee(int empid,String empname) 
	{
		this.empid=empid;
		this.empname=empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
//	@Override
//	public String toString() {
//		return "Employee [empid=" + empid + ", empname=" + empname + "]";
//	}
	

}
