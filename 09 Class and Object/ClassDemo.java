class Car
{
    int wheels;
    String modelno;
    double speed;

    // c=a+b;//error

    void accelerate()
    {
        System.out.println("Accelerating the car");
    }
    void showData()
    {
        System.out.println("======car details========");
        System.out.println("wheels :"+wheels);
        System.out.println("modelno  :"+modelno);
        System.out.println("speed :"+speed);
    }
}

public class ClassDemo 
{
    public static void main(String[] args) 
    {
        
        // Car myCar=new Car();//instantiation
        // myCar.showData();

        // myCar.wheels=5;
        // myCar.modelno="bmw";
        // myCar.speed=120.5;
        // myCar.accelerate();
        // myCar.showData();

        Car car2=new Car();
        car2.wheels=4;
        car2.modelno="bugati";
        car2.speed=400;
        car2.showData();
        car2.showData();
        car2.showData();
    }
}