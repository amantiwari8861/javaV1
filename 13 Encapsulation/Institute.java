package office.inistitute;
import office.teachers.Teachers;

public class Institute 
{
    Teachers t1=new Teachers();

    void showTeacherDetails()
    {
        System.out.println("Teacher Details");
        System.out.println("Name :"+t1.name);
        System.out.println("Id :"+t1.id);
        System.out.println("Gender :"+t1.gender);
        System.out.println("Salary :"+t1.salary);
    }
    
}