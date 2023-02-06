package normalperson;
import office.institute.Teachers;

public class TeachersSon extends Teachers
{
    public static void main(String[] args) {
        
        Teachers t1=new Teachers();

        System.out.println("Teacher Details");
        System.out.println("Name :"+t1.name);
        // System.out.println("Id :"+t1.id);
        // System.out.println("Salary :"+t1.salary);
        // System.out.println("Bank Balance :"+t1.bankBalance);

        TeachersSon ts=new TeachersSon();
        System.out.println("Salary :"+ts.salary);

    }
}
