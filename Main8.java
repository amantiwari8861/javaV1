class Vehicle 
{
    void run()
    {
        System.out.println("Run the Vehicle");
    }
}
class Bike extends Vehicle
{
    void run()
    {
        System.out.println("Run the Bike");
    }
}
public class Main8 {

public static void main(String[] args) {
    
    // Bike obj=new Parent();
    Vehicle pobj=new Vehicle();
    pobj.run();
}    
}