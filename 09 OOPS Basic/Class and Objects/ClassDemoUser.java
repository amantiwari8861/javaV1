class Car
{
    int wheels=4;
    String modelno="buggati veron";
    double speed=300.5;
    String ownerName;
    String regNo;

    void showData()
    {
        System.out.println("====== Car details ========");
        System.out.println("Owner name :"+ownerName);
        System.out.println("Registration no: "+regNo);
        System.out.println("wheels :"+wheels);
        System.out.println("modelno  :"+modelno);
        System.out.println("speed :"+speed);
    }
}
public class ClassDemoUser 
{
    public static void main(String[] args) 
    {
        Car car1=new Car();
        // car1.showData();
        car1.ownerName="Harsh";
        car1.regNo="UP16$R111";

        // car1.showData();
        System.out.println(car1.ownerName);
        System.out.println(car1.modelno);
    }
}