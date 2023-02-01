class Mammal
{
    void mammalfxn()
    {
        System.out.println("hello i am mammal fxn ");
    }
}
class Dog extends Mammal
{
    void dogfxn()
    {
        System.out.println("hello i am dog fxn ");
    }
}
class Cat extends Mammal
{
    void catfxn()
    {
        System.out.println("hello i am cat fxn ");
    }
}
class Human extends Mammal
{
    void humanfxn()
    {
        System.out.println("hello i am human fxn ");
    }
}
class Leopard extends Cat
{
    void leopardfxn()
    {
        System.out.println("hello i am leopard fxn ");
    }
}
class Lion extends Cat
{
    void lionfxn()
    {
        System.out.println("hello i am lion fxn ");
    }
}
class Main 
{
    public static void main(String[] args) {
        
        Lion obj=new Lion();
        obj.mammalfxn();
        obj.catfxn();
        obj.lionfxn();
    }
}

//polymorphism (overloading & overriding )
//inheritance ( 5 type of inheritance )
//encapsulation
//Abstraction