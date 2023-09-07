class Calculator
{
    String company="Casio";
    double price=800;

    void showDetails()
    {
        System.out.println("Company "+company);
        System.out.println("price "+price);
    }
    void volOfSphere(double r)
    {
        double result=4.0/3.0*3.14*r*r*r;
        System.out.println("Volume of Sphere :"+result);
    }
    double getPI()
    {
        return 3.14;
    }

    double volumeOfCone(double r,double h)
    {
        return 1.0/3.0*getPI()*r*r*h;
    }
}
public class Methods 
{
    public static void main(String[] args) 
    {
        Calculator t=new Calculator();
        t.showDetails();
        t.volOfSphere(2.5);

        double pi=t.getPI();
        System.out.println(pi+" is used");

        double vol=t.volumeOfCone(2.1, 3.5);
        System.out.println("Volume of cone is "+vol);

        System.out.println("Volume of cone is "+t.volumeOfCone(2, 4));
        System.out.println("Volume of cone is "+t.volumeOfCone(5,8.8));

        t.showDetails();
        t.showDetails();
        t.showDetails();
        t.showDetails();
        t.showDetails();
        t.showDetails();
        t.showDetails();
        t.showDetails();
        t.showDetails();
        t.showDetails();
        t.showDetails();

    }
}