package office.institute;

public class Owner 
{
    Teachers t1=new Teachers();

    public void showTeacherDetails()
    {
        System.out.println("Teacher Details");
        System.out.println("Name :"+t1.name);
        System.out.println("Id :"+t1.id);
        System.out.println("Salary :"+t1.salary);
        // System.out.println("Bank Balance :"+t1.bankBalance);
    }
    
}