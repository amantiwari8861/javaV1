package office.institute;

public class Teacher 
{
	public String name;
    private double bankBalance;
    protected double salary;
    int id;//default (non-access modifier)

    public Teacher() //here constructor was default 
    {
        this.name="Aman";
        this.id=100;
        this.salary=500000;
        this.bankBalance=120000;
    }
}
