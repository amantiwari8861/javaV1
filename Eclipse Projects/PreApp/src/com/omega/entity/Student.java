package com.omega.entity;

public class Student {
    
    private int studId;
    private String name;
    private long phoneNo;
    private double fee;
    private boolean isMarried;
    private char gender;

    public Student() {
    }

    public Student(int studId, String name, long phoneNo, double fee, boolean isMarried, char gender) {
        this.studId = studId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.fee = fee;
        this.isMarried = isMarried;
        this.gender = gender;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" + "studId=" + studId + ", name=" + name + ", phoneNo=" + phoneNo + ", fee=" + fee + ", isMarried=" + isMarried + ", gender=" + gender + '}';
    }
    
    
}
