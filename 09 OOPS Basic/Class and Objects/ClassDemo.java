class Car
{
    int wheels=4;
    String modelno="buggati veron";
    double speed=300.5;
    // c=a+b;//error bcz we can't write logic outside methods

    void accelerate()
    {
        System.out.println("Accelerating the car");
    }
    void showData()
    {
        System.out.println("====== Car details========");
        System.out.println("wheels :"+wheels);
        System.out.println("modelno  :"+modelno);
        System.out.println("speed :"+speed);
    }
}
public class ClassDemo 
{
    public static void main(String[] args) 
    {
        // int a;
        // Car devKiCar;//reference variable
        // // new Car(); //object
        // devKiCar=new Car();

        Car harshKiCar=new Car();//instantiation
        harshKiCar.showData();//method calling
        harshKiCar.accelerate();

        Car princeKiCar=new Car();
        princeKiCar.showData();
        princeKiCar.accelerate();
        
        harshKiCar.wheels=5;
        harshKiCar.modelno="bugati veron 2.0";
        harshKiCar.speed=380.5;
        harshKiCar.showData();
    }
}