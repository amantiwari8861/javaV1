import java.util.Scanner;

class Teacher
{
    int empId;
    String empName;
    float empSalary;
    String skills[];
    int noOfStudents;
    String teachingSkillLevel;
    Scanner sc;
    Teacher(){sc=new Scanner(System.in);}
    void setTeacherDetails()
    {
        System.out.println("**** Enter Teacher Details ********");
        System.out.print("Enter empId :");
        empId=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter empName :");
        empName=sc.nextLine();
        System.out.print("Enter no. Of Students :");
        noOfStudents=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Teaching Skill Level :");
        teachingSkillLevel=sc.nextLine();
    }
    void showTeacherDetails()
    {
        System.out.println("******* Teacher Details ***********");
        System.out.println("Teacher Id :"+empId);
        System.out.println("Teacher Name :"+empName);
        System.out.println("Teacher Salary :"+empSalary);
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
class FullTimeTeacher extends Teacher
{
    double chargePerDay;
    float bonusAmountPerYear;

    void setChargePerDay()
    {
        System.out.println("Enter charge Per Day:");
        chargePerDay=sc.nextDouble();
        empSalary=(float)(chargePerDay*28);
        bonusAmountPerYear=empSalary*0.25f;
    }
    void showFullTimeTeacherDetails()
    {
        System.out.println("******* Full-Time Teacher Details ***********");
        System.out.println("Charge Per Day :"+chargePerDay);
        System.out.println("Bonus Amount Per Year :"+bonusAmountPerYear);
    }
}
public class HeirarchicalHandler 
{
    public static void main(String[] args) 
    {
        // PartTimeTeacher ptt=new PartTimeTeacher();
        // ptt.setTeacherDetails();
        // ptt.setChargePerHour();
        // ptt.showTeacherDetails();
        // ptt.showPartTimeTeacherDetails();

        FullTimeTeacher ftt=new FullTimeTeacher();
        ftt.setTeacherDetails();
        ftt.setChargePerDay();
        ftt.showTeacherDetails();
        ftt.showFullTimeTeacherDetails();
    }
}