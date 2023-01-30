class Employee 
{
    int id;
    String name;
    long phone;
    char gender;
    Employee(){ System.out.println("default constructor runs");   }

    Employee(int id, String name, long phone, char gender) 
    {
        System.out.println("Setting Employee details");
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gender = gender;
    }
    void showDetails()
    {
        System.out.println("Normal Employee details");
        System.out.println("Id :"+id);
        System.out.println("name :"+name);
        System.out.println("phone :"+phone);
        System.out.println("gender :"+gender);
    }
    void greet()
    {
        System.out.println("Good Morning by Employee");
    }
}
class PartTimeEmployee extends Employee
{
    int id=2008;
    PartTimeEmployee(int id, String name, long phone, char gender) 
    {
        // this.id = id;
        // this.name = name;
        // this.phone = phone;
        // this.gender = gender;
        // super();//Constructor call must be the first statement in a constructor
        super(id, name, phone, gender);
    }
    void showSomething()
    {
        System.out.println("Id set by child is "+id);
        System.out.println("id set by parent was "+super.id);
        System.out.println("gender "+gender);//here jvm is adding super keyword in java
        System.out.println("gender "+super.gender);
        greet();
        super.greet();
    }
    void greet()
    {
        System.out.println("Good Morning by Part time Employee");
    }
}
class SuperDemo
{
    public static void main(String[] args) 
    {
        //SuperClass -> Parent class
        PartTimeEmployee ptm=new PartTimeEmployee(100, "Aman", 9891062743l, 'M');
        ptm.showDetails();
        ptm.showSomething();

    }
}