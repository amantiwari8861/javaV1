class Car
{
    String modelNo;
    double speed;
    int noOfSeats;

    Car()
    {
        modelNo="Buggati chiron";
        speed=500;
        noOfSeats=5;
    }
    void drive()
    {
        System.out.println("Driving "+modelNo+" "+noOfSeats+" seater having speed of "+speed);
    }
}