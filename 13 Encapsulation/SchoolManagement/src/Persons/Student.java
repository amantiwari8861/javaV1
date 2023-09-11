package Persons;

public class Student 
{
    public String name;
    private String fatherName;
    protected int rollNo;
    long phoneNo;

    public Student() 
    {
        name="Krishna";
        fatherName="abcd";
        rollNo=21;
        phoneNo=98958954L;
    }

    public void greet()
    {
        System.out.println("Hello Aman Sir!!!");
    }
}
