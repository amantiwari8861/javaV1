class Bus
{
    void drive()
    {
        System.out.println("Driving the Bus");
    }
}
class Bike
{
    void drive()
    {
        System.out.println("Driving the Bike");
    }
}
class Driver
{
    void driveBus()
    {
        //uses-a
       Bus b=new Bus();
       b.drive(); 
    }
    void driveBike()
    {
       Bike b=new Bike();
       b.drive(); 
    }
}

public class RunDriver 
{
    public static void main(String[] args) 
    {
        Driver d=new Driver();
        d.driveBus();
        d.driveBike();
        //the process of making object is called instantiation (relationship)
    }
}