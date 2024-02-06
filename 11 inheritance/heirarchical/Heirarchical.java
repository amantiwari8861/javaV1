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
class Dog extends Mammal
{
    int legs;
    float height;
    boolean isLoyal;
    Dog()
    {
        System.out.println("Dog Class Constructor");
        legs=4;
        height=3.5f;
        isLoyal=true;
    }
    void showDogProperty()
    {
        System.out.println("======Dog's property=======");
        System.out.println("Legs :"+legs);
        System.out.println("Height :"+height);
        System.out.println("is Dogs loyal :"+isLoyal);
    }
}
class Human extends Mammal
{
    int legs;
    float height;
    Human()
    {
        System.out.println("Human Class Constructor");
        legs=2;
        height=6;
    }
    void showHumanProperty()
    {
        System.out.println("======Human's property=======");
        System.out.println("Legs :"+legs);
        System.out.println("Height :"+height);
    }
}

public class Heirarchical {

    public static void main(String[] args) {
        
        Mammal m=new Mammal();
        m.showMammalProperty();

        Cat c=new Cat();
        c.showMammalProperty();
        c.showCatProperty();

        Dog d=new Dog();
        d.showMammalProperty();
        d.showDogProperty();

        Human h=new Human();
        h.showMammalProperty();
        h.showHumanProperty();

    }
}