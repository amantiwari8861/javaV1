abstract class Vehicle
{
    int num;
    Vehicle()
    {
        num=100;
    }
    abstract void accelerate();
    void show()
    {
        System.out.println("hii i am parent");
    }
    
}
class Bike extends Vehicle
{
    void show()
    {
        System.out.println("hii i am child");
    }   
    void accelerate() {
    super.show();
    System.out.println("accelerating the Bike");        
    }
}
class Abstract
{
    public static void main(String[] args) {
        // Vehicle obj=new Vehicle();
        // Bike b=new Bike();
        // b.accelerate();
        // b.show();
        Vehicle v=new Bike();
        // v.show();
        v.accelerate();
    }
}