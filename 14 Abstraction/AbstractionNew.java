abstract class Vehicle 
{
    double speed;
    Vehicle()
    {
        speed=120.5;
    }
    abstract void showDetails();
    void accelerate()
    {
        System.out.println("accelerating the vehicle");
    }
}
class Bike extends Vehicle
{
    Bike()
    {
        speed=300;
    }
    void showDetails()
    {
        System.out.println("Bike speed is "+speed);
    }
    void showNoOfTires()
    {
        System.out.println("there are "+2+"tyres");
    }
}
class Car extends Vehicle
{
    Car()
    {
        speed=400;
    }
    void showDetails()
    {
        System.out.println("The top speed of car is "+speed);
    }
    void showNoOfTires()
    {
        System.out.println("there are "+4+"tyres");
    }
}
public class AbstractionNew {

    public static void main(String[] args) {
        
        // Vehicle v=new Vehicle();

        // Bike kawasakiNinja=new Bike();
        // c.accelerate(); //parent
        // kawasakiNinja.showDetails();
        // kawasakiNinja.showNoOfTires();

        // Car c=new Car();
        // c.accelerate(); //parent
        // c.showDetails();//both
        // c.showNoOfTires();//child error

        Vehicle v=new Bike();  //generalization
        v.accelerate(); //parent
        v.showDetails();//both
        // v.showNoOfTires();//child error


        // Car c=new Vehicle();
        // Vehicle v=new Vehicle();
        // Bike b=new Bike();
        // Car c=new Car();

        // v=(Bike)b;
        // v=b;
        // v=c;
        // b=c;
        // c=(Car)b;
        // v.accelerate();
        // v.showDetails();
        // v.showNoOfTires();

    }
}