class Car
{
    String color;
    Car(){System.out.println("default constructor of Car");}
    void accelerate(){System.out.println("i am a car");}
}
class Honda extends Car
{
    float speed;
    void fxn()
    {
        System.out.println("any fxn");
    }
}
public class RelationShip {
    
    public static void main(String[] args) {
        Honda obj=new Honda();
        obj.accelerate();
        obj.fxn();
    }
}