abstract class Vehicle 
{
    double power;
    String color;
    double speed;
    abstract void steer();
    void showVehicleFeatures()
    {
        System.out.println("No feature for common Vehicle");
    }
}
class Aeroplane extends Vehicle
{
    void steer()
    {
        System.out.println("steered by Pilot.");
    }
    void fly()
    {
        System.out.println("aeroplane can fly in air");
    }
    @Override
    void showVehicleFeatures() 
    {
        System.out.println("********* Aerolane Features ***********");
    }
}
abstract class Ship extends Vehicle
{
    abstract void sail(); 
}
class CargoShip extends Ship
{
    double cargoCapacity=15000;
    @Override
    void sail() 
    {
        System.out.println("sail by a captain and some machines");
    }
    @Override
    void steer() 
    {
        System.out.println("steered by Captian and it's crew");
    }
    @Override
    void showVehicleFeatures() 
    {
        System.out.println("********* CargoShip Features ***********");
    }
}
class PassengerShip extends Ship
{
    int noOfPassengers=100;
    @Override
    void steer() 
    {
        System.out.println("steered by Captian and it's crew and some workers");
    }
    @Override
    void sail()
    {
        System.out.println("sail by a captain and some staff");
    }
    @Override
    void showVehicleFeatures() 
    {
        System.out.println("********* Passenger Ship Features ***********");
    }
}
public class VehicleDesign 
{
    public static void main(String[] args) 
    {
        // CargoShip cs=new CargoShip();
        // cs.sail();
        // cs.steer();
        // System.out.println(cs.cargoCapacity);

        // Aeroplane ap=new Aeroplane();
        // ap.steer();
        // ap.fly();

        // PassengerShip ps=new PassengerShip();
        // ps.sail();
        // ps.steer();
        // System.out.println(ps.noOfPassengers);

        Vehicle v=new Aeroplane();
        v.showVehicleFeatures();//updated
        v.fly();

        // Vehicle v=new PassengerShip();
        // v.showVehicleFeatures();
        // v.sail();

        // Ship s=new PassengerShip();
        // s.showVehicleFeatures();
        // s.sail();
    }
}