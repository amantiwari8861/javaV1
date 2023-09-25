package entities;

import java.util.Arrays;

public class Student 
{
    private int rollNo;
    private String name;
    private float fees;
    private String skills[];
    private char gender;
    private long mobileNo;
    
    public Student() {}

    public Student(int rollNo, String name, float fees, String[] skills, char gender, long mobileNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.fees = fees;
        this.skills = skills;
        this.gender = gender;
        this.mobileNo = mobileNo;
    }
    public Student( String name, float fees, String[] skills, char gender, long mobileNo) {
        this.name = name;
        this.fees = fees;
        this.skills = skills;
        this.gender = gender;
        this.mobileNo = mobileNo;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getFees() {
        return fees;
    }
    public void setFees(float fees) {
        this.fees = fees;
    }
    public String[] getSkills() {
        return skills;
    }
    public void setSkills(String[] skills) {
        this.skills = skills;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public long getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", fees=" + fees + ", skills=" + Arrays.toString(skills)
                + ", gender=" + gender + ", mobileNo=" + mobileNo + "]";
    }
}
