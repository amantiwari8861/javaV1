class Mammal
{
    String bloodType;
    String reproduceMethod;
    Mammal()
    {
        bloodType="Warm";
        reproduceMethod="Birth";
        System.out.println("Mammal Created");
    }
    void showMammalProperty()
    {
        System.out.println("=====Mammal's Property===========");
        System.out.println("Blood Type:"+bloodType);
        System.out.println("Reproduce Method:"+reproduceMethod);

    }
}
class Cat extends Mammal
{
    int legs;
    float height;
    Cat()
    {
        System.out.println("Cat Class Constructor");
        legs=4;
        height=1.5f;
    }
    void showCatProperty()
    {
        System.out.println("======Cat's property=======");
        System.out.println("Legs :"+legs);
        System.out.println("Height :"+height);
    }
}
class Leopard extends Cat
{
    float speed;
    Leopard()
    {
        speed=100;
        height=4.2f;
        System.out.println("Leopard constructor ");
    }
    void showLeopardProperty()
    {
        System.out.println("=======Leopard property=========");
        System.out.println("Speed :"+speed);
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args) {
        
        Leopard l=new Leopard();
        l.showMammalProperty();
        l.showCatProperty();
        l.showLeopardProperty();

    }
}