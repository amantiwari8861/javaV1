abstract class Vehicle
{
     void model()
     {
         System.out.println("hello world ");
     }
    abstract void speed();
    // {
        // System.out.println("i am a abstract fxn ");error
    // }
}
class Bike extends Vehicle
{
    void speed()
    {
        System.out.println("max speed is 500km/h ");
    }
    public static void main(String[] args) {
        Vehicle obj=new Bike();
        obj.speed();
        obj.model();
    }
}