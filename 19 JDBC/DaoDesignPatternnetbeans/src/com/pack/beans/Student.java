package com.pack.beans;

public class Student 
{
    private int id;
    private String name;
    private int age;
    private double fees;
    private long phone;

    public Student() {
    }

    public Student(int id, String name, int age, double fees, long phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.fees = fees;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", fees=" + fees + ", phone=" + phone + '}';
    }
    
    
    
}