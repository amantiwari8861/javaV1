//has-a relationship (a car has a Engine)

class Car 
{
    Engine e=new Engine();//instance variable

    void startCar()
    {
        e.startEngine();
        System.out.println("Now Starting the Car");
    }
    
}
public class RunCar
{
    public static void main(String[] args) 
    {
        Car c=new Car();
        c.startCar();
    }
}