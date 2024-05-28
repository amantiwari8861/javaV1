class Car //class means blueprint
{
    // attributes(data -> variables) and behaviours(functionality -> method(fuction) )
    int price;
    String color;
    int noOfSeats;
    String modelNo;
    double speed;
    Car()
    {
        System.out.println("constructing a car");
        speed=300.56;
    }
    void accelerate()
    {
        System.out.println("Car is acceleration at top speed of "+speed+" km/hr");
    }
}

public class Hello {

    public static void main(String[] args) {
        
        // System.out.println("Hello world!");
        // blueprint(class) -> real world entity (object)
        // Car gauravKiCar;
        // gauravKiCar=new Car();

        // gauravKiCar.accelerate();

        // System.out.println("Top Speed:"+gauravKiCar.speed+" km/hr");

        int a=10,b=20,c;
        c=a+b;

        System.out.println("c");
        System.out.println(c);
        System.out.println("c="+c);
        System.out.println("c="+c+" hai");
        System.out.println("The sum of "+a+" and "+b+" is "+c);
    }
    
}