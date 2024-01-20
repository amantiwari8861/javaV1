// why inheritance ? 
class Mammal
{
    String bloodType;
    String reproduceMethod;
    Mammal()
    {
        bloodType="Warm";
        reproduceMethod="Birth";
        System.out.println("Mammal Class Constructor");
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

public class SingleInheritance 
{
    public static void main(String[] args) 
    {
        Cat c=new Cat();
        c.showMammalProperty();
        c.showCatProperty();
    }
}