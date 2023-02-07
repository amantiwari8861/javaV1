package normalperson;
import office.institute.Teacher;

public class TeachersSon extends Teacher
{
	void getTeacherDetails()
	{
		Teacher t1=new Teacher();
		System.out.println("Teacher Details");
        System.out.println("Name :"+t1.name);
//        System.out.println("Id :"+t1.id);
//        System.out.println("Salary :"+t1.salary);
//        System.out.println("Bank Balance :"+t1.bankBalance);
	}
	public static void main(String[] args) 
	{
		TeachersSon tes=new TeachersSon();
		tes.getTeacherDetails();
		
		System.out.println("Father's Salary :"+tes.salary);
	}
}
