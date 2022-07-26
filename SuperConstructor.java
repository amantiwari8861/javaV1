/* class Bike
{
    String name;
    Bike(){
        System.out.println("hello i am default constructor of parent");
    }
    Bike(String name)
    {
        this.name=name;
        System.out.println("the name is :"+name);
    }
}
class Hero extends Bike
{
    Hero()
    {
        // super();
        super("abc");
        System.out.println("hello i am default constructor of child");
    }
}
class Run
{
    public static void main(String[] args) {
        Hero obj=new Hero();        
    }
} */
class Vehicle
{
    int speed;
    Vehicle()
    {
        System.out.println("default constructor");
    }
    Vehicle(int speed)
    {
        this.speed=speed;
    }
}
class Bike extends Vehicle
{
    String color;
    Bike(int speed,String color)
    {
        super(speed);
        // super(); calls by default
        this.color=color;
    }
    void start()
    {
        System.out.println("Bike started");
        System.out.println("child speed is "+speed);
        System.out.println("child color is "+color);
    }
}
public class SuperConstructor {
    public static void main(String[] args) {
        Bike b = new Bike(67,"red");
        b.start();
    }
}