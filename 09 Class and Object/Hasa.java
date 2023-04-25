class Car
{
    void carfxn()
    {
        System.out.println("my Car is starting with a Engine  ");
    }
}
class run{
    public static void main(String args[])
    {
        Engine obj2=new Engine();
        Car obj=new Car();
        obj2.enginefxn();
        obj.carfxn();
    }
}