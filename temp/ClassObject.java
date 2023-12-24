class Car
{
    int noOfWheels=5;
    String modelNo;
    double height;
    double width;
    String color;
    void accelerate()
    {
        System.out.println("accelerating the car");
    }
    void showCarDetails()
    {
        System.out.println("==== Car Details starting =======");
        System.out.println("No of Wheels :"+noOfWheels);
        System.out.println("Model No :"+modelNo);
        System.out.println("Height :"+height);
        System.out.println("Width :"+width);
        System.out.println("Color :"+color);
        System.out.println("==== Car Details ending =======");
    }
}

public class ClassObject 
{
    public static void main(String[] args) 
    {
        // Car car1=new Car();// new is used to dynamically allocate the memory
        // // here object name is car1
        // // the process of making object(instance) is called instantiation

        // System.out.println(car1.noOfWheels);
        // System.out.println(car1.modelNo);

        // car1.showCarDetails();

        // car1.modelNo="Bugati cheron";
        // // System.out.println(car1.modelNo);

        // car1.showCarDetails();

        Car khushiKiCar=new Car();
        khushiKiCar.modelNo="Nano";
        khushiKiCar.height=5.55;
        khushiKiCar.noOfWheels=4;
        khushiKiCar.width=4.9;
        khushiKiCar.color="Pink";
        khushiKiCar.showCarDetails();

        Car amanKiCar=new Car();
        amanKiCar.color="Z black matte finish";
        amanKiCar.height=6.2;
        amanKiCar.width=5.9;
        amanKiCar.noOfWheels=5;
        amanKiCar.modelNo="Bugati Cheron";
        amanKiCar.showCarDetails();

        //there must be only 1 public class in a file and 
        //it must be that class in which we have the main method


    }
}