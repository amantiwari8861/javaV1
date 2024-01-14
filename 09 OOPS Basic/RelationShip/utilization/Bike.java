class Bike
{
    String modelNo;
    double speed;
    int noOfSeats;

    Bike()
    {
        modelNo="Kawasaki Ninja 10R";
        speed=400;
        noOfSeats=2;
    }
    void drive()
    {
        System.out.println("Driving "+modelNo+" of "+noOfSeats+" having speed of "+speed);
    }
}