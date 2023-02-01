class Car
{
    // Engine2 obj=new Engine2();//composition
    void Carfxn()
    {
        Engine2 obj=new Engine2();//uses-a
        obj.EngineFxn();
        System.out.println("My car is starting with Engine ");
    }
    public static void main(String[] args) {
        Car obj2=new Car();
        obj2.Carfxn();
    }
}