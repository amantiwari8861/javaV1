class Vehicle
{
     void v1()
     {
         System.out.println("hello by  vehicle ");
     }
     void speed()
    {
        System.out.println("i am in vehicle class ");
    }
}
class Bike extends Vehicle
{
    void speed()
    {
        System.out.println("i am in Bike class ");
    }
    void B1()
    {
        System.out.println("i am B1 fxn");
    }
}
public class TestOverriding {

    public static void main(String[] args) {
        Vehicle obj=new Bike();
        obj.speed();
        obj.v1();
        // obj.B1();
    }
}