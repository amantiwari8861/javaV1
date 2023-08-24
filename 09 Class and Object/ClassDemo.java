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

        Car myCar=new Car();//instantiation
        myCar.showData();

        // myCar.wheels=5;
        // myCar.modelno="bmw";
        // myCar.speed=120.5;
        // myCar.showData();
        // myCar.accelerate();

        // Car car2=new Car();
        // car2.wheels=4;
        // car2.modelno="bugati";
        // car2.speed=400;
        // car2.showData();
        // car2.showData();
        // car2.showData();
    }
}