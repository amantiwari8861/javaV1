package Drivers;

import Vehicles.Bike;

public class BikeRider 
{
    public String name;
    public BikeRider()
    {
        name="Prince";
    }
    public void rideBike()
    {
        Bike b=new Bike("Model 2023", 200.5, "orange");
        System.out.print("Riding "+b.brand+" "+b.model+" of colour "+b.colour+" having speed of "+b.speed+"km/hr");
        System.out.println(" by "+name);
    }
}