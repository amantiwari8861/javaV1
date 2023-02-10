abstract class Vehicle
{
    void model()
    {
       System.out.println("Default Model of BMW");
    }
    abstract void speed();
    // {
    //     System.out.println("i am a abstract fxn "); //error can't have body
    // }
}
class Bike extends Vehicle
{
    void speed()
    {
        System.out.println("max speed is 500km/h ");
    }
    void showTires()
    {
        System.out.println("2 Tires");
    }
}
public class Abstraction {

    public static void main(String[] args) {
        
        // Vehicle v=new Vehicle(); //error cannot be instantiated

        // Bike b=new Bike();
        // b.speed();
        // b.model();
        // b.showTires();
        
        Vehicle obj=new Bike();
        obj.speed();
        obj.model();
        obj.showTires();
    }
}