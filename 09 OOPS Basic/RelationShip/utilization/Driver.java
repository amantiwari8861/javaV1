class Driver
{

    Car c2=new Car();// has-a

    void driveCar()
    {
        Car c=new Car();// uses-a
        c.drive();
    }
    void driveBike()
    {
        Bike b=new Bike();
        b.drive();
    }
    void printVehicleDetails()
    {
        System.out.println("i have ");
        // c.drive();
        // b.drive();
        // {
        //     int a=10;
        // }
        // System.out.println(a);
    }

}