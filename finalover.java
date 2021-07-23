class Car
{
    int speed=100;
    final void accelerate()
    {
        System.out.println("the speed is :"+speed);
    }
}
class Maruti extends Car
{
    int speed=250;
    void accelerate()
    {
        System.out.println("the speed of maruti is :"+speed);
    }
}
class FinalOver {
    public static void main(String[] args) {
        Car obj=new Maruti();
        obj.accelerate();
    }  
}