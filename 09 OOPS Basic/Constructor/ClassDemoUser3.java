import java.util.Scanner;

class Car
{
    int wheels=4;
    String modelno="rolls royals";
    double speed=200.5;
    String ownerName;//instance variable
    String color;

    Car(String owner,String c)//constructor name must be same as class name and it must not have a return type
    {
        ownerName=owner;//here owner is local variable
        color=c;
    }
    void showData()
    {
        System.out.println("====== Car details ========");
        System.out.println("Owner name :"+ownerName);
        System.out.println("Color: "+color);
        System.out.println("wheels :"+wheels);
        System.out.println("modelno  :"+modelno);
        System.out.println("speed :"+speed);
    }
}
public class ClassDemoUser3
{
    public static void main(String[] args) 
    {
        Car car1=new Car("Krishna", "Royal blue");
        car1.showData();
        //constructor is a special type of method which is used to initialize the data members and member fuctions of a class

        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter owner name");
        String owner=sc.nextLine();
        System.out.println("Enter color");
        String color=sc.nextLine();

        Car car2=new Car(owner,color);
        // car2.showData();
        // car2.showData();
        // car2.showData();
        // car2.showData();
        // car2.showData();

        for (int i = 0; i < 5; i++) 
        {
            car1.showData();
        }
    }
}