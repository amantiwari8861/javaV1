abstract class Vehicle{
    double power;
    String color;
    abstract void steer();
}
class Aeroplane extends Vehicle
{
    void steer()    {
        System.out.println("steering the aeroplane by pilot");
    }
    void fly(){
        System.out.println("fly in sky");
    }
}
abstract class Ship extends Vehicle{
    abstract void sail();
}
class CargoShip extends Ship{
    double cargoCapacity=500.7;
    void steer(){
        System.out.println("steering the cargo ship by captain");
    }
    void sail(){
        System.out.println("sailing the cargo ship by captain having cargo capacity of "+cargoCapacity);
    }
}
class PassengerShip extends Ship{
    long noOfPassengers=200;

    void steer(){
        System.out.println("steering the passenger ship by captain");
    }
    void sail(){
        System.out.println("sailing the passenger ship by captain with "+noOfPassengers+" passengers");
    }
}
public class MultiLayeredAbstraction 
{
    public static void main(String[] args) 
    {
        // PassengerShip ps=new PassengerShip();
        // ps.steer();
        // ps.sail();
        
        // CargoShip cs=new CargoShip();
        // cs.steer();
        // cs.sail();

        // Aeroplane a=new Aeroplane();
        // a.steer();
        // a.fly();


        Vehicle v=new PassengerShip(); //generalization
        v.steer();
        // v.sail(); //error

        Ship s=new PassengerShip(); //
        s.steer();
        s.sail();
    }
}