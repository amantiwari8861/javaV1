package office.teachers;

public class Teachers 
{
    public String name;
    private double salary;
    protected long phone;
    char gender;//default (non-access modifier)

    public Teachers() //here constructor was default 
    {
        this.name="Aman";
        this.id=101;
        this.gender='M';
        this.salary=500000;
    }

    public Teachers(String name,double salary,int id,char gender)
    {
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.gender=gender;
    }
    
}