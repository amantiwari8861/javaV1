package office.institute;
public class Teachers 
{
    public String name;
    private double bankBalance;
    protected double salary;
    int id;//default (non-access modifier)

    public Teachers() //here constructor was default 
    {
        this.name="Aman";
        this.id=100;
        this.salary=500000;
        this.bankBalance=120000;
    }
    public Teachers(String name, double bankBalance, double salary, int id) {
        this.name = name;
        this.bankBalance = bankBalance;
        this.salary = salary;
        this.id = id;
    }   
}