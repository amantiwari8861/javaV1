class Car
{
    void carfxn()
    {
        Engine obj2=new Engine();
        obj2.enginefxn();
        System.out.println("my Car is starting with a Engine  ");
    }
}
class run{
    public static void main(String args[])
    {
        Car obj=new Car();
        obj.carfxn();
    }
}
class Engine 
{
    void enginefxn()
    {
        System.out.println("Starting Engine ");
    }
}