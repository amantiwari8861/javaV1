abstract class Vehicle
{
    Vehicle(){}
    int power;
    String color;

    abstract void steer();
}

class Airplane extends Vehicle
{
    Airplane(){}
    Airplane(int power, String color)
    {
        this.power = power;
        this.color = color;
    }
    void showAirplaneInfo()
    {
        System.out.println("Airplane's  information: ");
        System.out.println("Power: "+power+" KW");
        System.out.println("Color: "+color);
    }
    void steer()
    {
        System.out.println("This is airplane's steering.");
    }
    void fly()
    {
        System.out.println("It flies in the air.");
    }
}

class Ship extends Vehicle
{
    Ship(){}
    Ship(int power, String color)
    {
        this.power = power;
        this.color = color;
    }
    void showShipInfo()
    {
        System.out.println("Ship's information: ");
        System.out.println("Power: "+power+" KW");
        System.out.println("Color: "+color);
    }
    void steer()
    {
        System.out.println("This is Ship's steering.");
    }
    void sail()
    {
        System.out.println("It sails in ocean.");
    }
}

class CargoShip extends Ship
{
    CargoShip(){}
    int cargoCapacity;
    CargoShip(int power, String color)
    {
        this.power = power;
        this.color = color;
    }
    void showCargoShipInfo()
    {
        System.out.println("CargoShip's information: ");
        System.out.println("Power: "+power+" KW");
        System.out.println("Color: "+color);
    }
    @Override
    void steer()
    {
        System.out.println("This is Cargoship's steering.");
    }
    @Override
    void sail()
    {
        System.out.println("CargoShip supplies products.");
    }
}

class PassengerShip extends Ship
{
    PassengerShip(){}
    int num_of_passengers;
    PassengerShip(int power, String color)
    {
        this.power = power;
        this.color = color;
    }
    void showPassengerShipInfo()
    {
        System.out.println("Passenger ship's information.");
        System.out.println("Power: "+power+" KW");
        System.out.println("Color: "+color);
    }
    void steer()
    {
        System.out.println("This is passengerShip's steering");
    }
    void sail()
    {
        System.out.println("Passenger ship carries people.");
    }
}

public class Ships
{
    public static void main(String[] args) {
     Airplane obj1 = new Airplane(500,"White");
     obj1.showAirplaneInfo();
     obj1.steer();
     obj1.fly();
     Ship obj2 = new Ship(1000,"Blue");
     obj2.showShipInfo();
     obj2.steer();
    //  obj2.
     Ship obj3 = new CargoShip(1100,"Red");
     obj3.showCargoShipInfo();
    //  obj3.
     PassengerShip obj4 = new PassengerShip(1500,"Yellow");
     obj4.showPassengerShipInfo();

    }
}