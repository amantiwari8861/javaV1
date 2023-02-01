abstract class vehicle2
{
    vehicle2()
    {
        System.out.println("hii i am constructor in abstract ");
    }
    final float PI=3.14f;//final variable
    static String companyName="MyCompany";//static variable
    int speed=200;//instance variable
    abstract void accelerate();//abstract method
    void createVehicle()//non-abstract method
    {
        System.out.println("creating a vehicle ");
    }
}
// abstract class Bike3 extends vehicle2
class Bike3 extends vehicle2
{
    //parent class object is created by compiler internally
    void accelerate()
    {
        System.out.println("accelerting my bike ");
        System.out.println("the speed is "+speed+" "+PI);
    }
}

public class abstraction2 {

    public static void main(String[] args) {
        // Bike3 obj=new Bike3();
        vehicle2 obj=new Bike3(); //overriding
        obj.accelerate();
        obj.createVehicle();
        System.out.println("the company name is :"+vehicle2.companyName);
        // vehicle2 obj2=new vehicle2(); we can't create object of a abstract class 
    }
}