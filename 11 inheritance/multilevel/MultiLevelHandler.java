import java.util.Scanner;

class Employee
{
    int empId;
    String empName;
    float empSalary;
    String skills[];
    Scanner sc;
    Employee(){sc=new Scanner(System.in);}

    void setEmpDetails()
    {
        System.out.println("**** Enter Basic Employee Details ********");
        System.out.print("Enter empId :");
        empId=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter empName :");
        empName=sc.nextLine();
        System.out.print("Enter empSalaray :");
        empSalary=sc.nextFloat();
    }
    void showEmployeeDetails()
    {
        System.out.println("******* Employee Details ***********");
        System.out.println(" empId :"+empId);
        System.out.println(" empName :"+empName);
        System.out.println(" empSalary :"+empSalary);
    }
}
class Teacher extends Employee 
{
    int noOfStudents;
    String teachingSkillLevel;
    void setTeacherDetails()
    {
        System.out.println("**** Enter Teacher Details ********");
        System.out.print("Enter no. Of Students :");
        noOfStudents=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Teaching Skill Level :");
        teachingSkillLevel=sc.nextLine();
    }
    void showTeacherDetails()
    {
        System.out.println("******* Teacher Details ***********");
        System.out.println("No. Of Students :"+noOfStudents);
        System.out.println("Teaching skill Level :"+teachingSkillLevel);
    }
}
class PartTimeTeacher extends Teacher
{
    double chargePerHour;
    double noOfHoursTeaches;
    void setChargePerHour()
    {
        System.out.println("Enter charge Per Hour:");
        chargePerHour=sc.nextDouble();
        System.out.print("Enter no. of Hour Teaches(in month):");
        noOfHoursTeaches=sc.nextDouble();
        empSalary=(float)(chargePerHour*noOfHoursTeaches);
    }
    void showPartTimeTeacherDetails()
    {
        System.out.println("******* Part-Time Teacher Details ***********");
        System.out.println("Charge Per Hour :"+chargePerHour);
        System.out.println("No. of Hour Teaches:"+noOfHoursTeaches);
    }
}
public class MultiLevelHandler 
{
    public static void main(String[] args) 
    {
        Employee emp1=new Employee();
        emp1.setEmpDetails();
        emp1.showEmployeeDetails();

        Teacher t=new Teacher();
        t.setEmpDetails();
        t.setTeacherDetails();
        t.showEmployeeDetails();
        t.showTeacherDetails();

        PartTimeTeacher ptt=new PartTimeTeacher();
        ptt.setEmpDetails();
        ptt.setTeacherDetails();
        ptt.setChargePerHour();
        ptt.showEmployeeDetails();
        ptt.showTeacherDetails();
        ptt.showPartTimeTeacherDetails();
    }
}