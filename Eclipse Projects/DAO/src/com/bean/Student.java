package com.bean;

public class Student {

	private Integer rollno;
	private String name;
	private Long mobile;
	private Double fees;
	
	public Student(Integer rollno, String name, Long mobile, Double fees) 
	{
		this.rollno = rollno;
		this.name = name;
		this.mobile = mobile;
		this.fees = fees;
	}
	
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", mobile=" + mobile + ", fees=" + fees + "]";
	}

	
}
