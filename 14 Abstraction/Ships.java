abstract class Vehicle {
    Vehicle() {
    }

    int power;
    String color;

    abstract void drivingMethod();
}

class Airplane extends Vehicle {
    Airplane() {
    }

    Airplane(int power, String color) {
        this.power = power;
        this.color = color;
    }

    void showAirplaneInfo() {
        System.out.println("Airplane's  information: ");
        System.out.println("Power: " + power + " KW");
        System.out.println("Color: " + color);
    }

    @Override
    void drivingMethod() {
        System.out.println("This airplane is operating by pilot.");
    }

    void fly() {
        System.out.println("It flies in the air.");
    }
}

class Ship extends Vehicle {
    Ship() {
    }

    Ship(int power, String color) {
        this.power = power;
        this.color = color;
    }

    void showShipInfo() {
        System.out.println("Ship's information: ");
        System.out.println("Power: " + power + " KW");
        System.out.println("Color: " + color);
    }

    @Override
    void drivingMethod() {
        System.out.println("This Ship is sailing by Captain.");
    }

    void sail() {
        System.out.println("It sails in ocean.");
    }
}

class CargoShip extends Ship {
    CargoShip() {
    }

    float cargoCapacity;

    CargoShip(int power, String color, float cargoCapacity) {
        this.power = power;
        this.color = color;
        this.cargoCapacity = cargoCapacity;
    }

    void showCargoShipInfo() {
        System.out.println("CargoShip's information: ");
        System.out.println("Power: " + power + " KW");
        System.out.println("Color: " + color);
        System.out.println("Cargo Capacity: " + cargoCapacity);
    }

    @Override
    void drivingMethod() {
        System.out.println("This is Cargoship's steering.");
    }

    @Override
    void sail() {
        System.out.println("CargoShip supplies products.");
    }
}

class PassengerShip extends Ship {
    PassengerShip() {
    }

    int numOfPassengers;

    PassengerShip(int power, String color, int numOfPassengers) {
        this.power = power;
        this.color = color;
        this.numOfPassengers = numOfPassengers;
    }

    void showPassengerShipInfo() {
        System.out.println("Passenger ship's information.");
        System.out.println("Power: " + power + " KW");
        System.out.println("Color: " + color);
        System.out.println("Number of Passengers: " + numOfPassengers);
    }

    void drivingMethod() {
        System.out.println("This is passengerShip's steering");
    }

    void sail() {
        System.out.println("Passenger ship carries people.");
    }
}

public class Ships {
    public static void main(String[] args) {

        Airplane obj1 = new Airplane(500, "White");
        obj1.showAirplaneInfo();
        obj1.drivingMethod();
        obj1.fly();
        System.out.println("------------------------------------------");

        Ship obj2 = new Ship(1000, "Blue");
        obj2.showShipInfo();
        obj2.drivingMethod();
        System.out.println("------------------------------------------");

        CargoShip obj3 = new CargoShip(1100, "Red", 150.5f);
        obj3.showCargoShipInfo();
        obj3.drivingMethod();
        obj3.sail();
        System.out.println("------------------------------------------");

        PassengerShip obj4 = new PassengerShip(1500, "Yellow", 50);
        obj4.showPassengerShipInfo();
        obj3.drivingMethod();
        obj3.sail();
        System.out.println("------------------------------------------");

    }
}