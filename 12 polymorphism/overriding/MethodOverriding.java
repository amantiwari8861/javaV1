import java.util.Scanner;

class Teacher
{
    String empName;
    float empSalary;
    Scanner sc;
    Teacher(){sc=new Scanner(System.in);}
    void setTeacherDetails()
    {
        System.out.print("Enter empName :");
        empName=sc.nextLine();
    }
    void calculateSalary()
    {
        empSalary=800*8*30;
    }
    void showTeacherDetails()
    {
        System.out.println("****** Teacher Detail ***********");
        System.out.println("Teacher Name :"+empName);
        System.out.println("Teacher Salary :"+empSalary);
    }
}
class PartTimeTeacher extends Teacher
{
    double chargePerHour;
    double noOfHoursTeaches;

    @Override  
    void calculateSalary()
    {
        System.out.print("Enter charge Per Hour:");
        chargePerHour=sc.nextDouble();
        System.out.print("Enter no. of Hour Teaches(in month):");
        noOfHoursTeaches=sc.nextDouble();
        empSalary=(float)(chargePerHour*noOfHoursTeaches);
    }
    void showTeacherDetails()
    {
        System.out.println("******* Part-Time Teacher Details ***********");
        System.out.println("Teacher Name :"+empName);
        System.out.println("Teacher Salary :"+empSalary);
        System.out.println("Charge Per Hour :"+chargePerHour);
        System.out.println("No. of Hour Teaches:"+noOfHoursTeaches);
    }
}
class FullTimeTeacher extends Teacher
{
    double chargePerDay;
    float bonusAmountPerYear;

    void calculateSalary()
    {
        System.out.print("Enter charge Per Day:");
        chargePerDay=sc.nextDouble();
        empSalary=(float)(chargePerDay*28);
        bonusAmountPerYear=empSalary*0.25f;
    }
    void showTeacherDetails()
    {
        System.out.println("******* Full-Time Teacher Details ***********");
        System.out.println("Teacher Name :"+empName);
        System.out.println("Teacher Salary :"+empSalary);
        System.out.println("Charge Per Day :"+chargePerDay);
        System.out.println("Bonus Amount Per Year :"+bonusAmountPerYear);
    }
}
public class MethodOverriding {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter teacher type:");
        String teacherType=sc.nextLine();

        Teacher t;
        if (teacherType.equals("full time")) 
        {
            t=new FullTimeTeacher();
        }
        else if(teacherType.equals("part time"))
        {
            t=new PartTimeTeacher();
        }
        else
        {
            t=new Teacher();
        }
        t.setTeacherDetails();
        t.calculateSalary();
        t.showTeacherDetails();
        sc.close();
    }
}