class vehicle
{
    int modelno=2022;//instance variable
    int speed;//instance variable
    String modelname;//instance variable
    void setModelName(String modelname2)
    {
        modelname=modelname2;// modelname2 is also an local variable
        // int id=400; //local variable
        System.out.println("modelname set with modelname2 :"+modelname);
    }
    void showModel()
    {
        System.out.println("model Name is "+modelname);
    }
    void showSpeed()
    {
        System.out.println("speed is "+speed);
    }
}

public class class1 {
public static void main(String[] args) {
    vehicle Mercedese=new vehicle();//reference variable (mercedese)
    vehicle bike=new vehicle();//reference variable (bike)
    Mercedese.setModelName("mercedese benz");
    bike.setModelName("hero honda bike");
    Mercedese.speed=50;
    Mercedese.showSpeed();
    System.out.println("--------------------------");
    System.out.println(Mercedese.modelno);
    Mercedese.showModel();
    bike.showModel();


}  
} 