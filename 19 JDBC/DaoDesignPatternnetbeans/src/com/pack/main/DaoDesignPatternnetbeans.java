package com.pack.main;

import com.pack.beans.Student;
import java.util.Scanner;

public class DaoDesignPatternnetbeans 
{
    Scanner sc = new Scanner(System.in);

    public Student getStudentDetails()
    {
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.print("Enter age:");
        int age = sc.nextInt();
        System.out.print("Enter phone:");
        long phone = sc.nextLong();
        System.out.print("Enter fees:");
        double fees = sc.nextDouble();
        
        Student student=new Student(age, name, age, fees, phone);
        return student;
    }
    
    public static void main(String[] args) 
    {
        
    }
}
