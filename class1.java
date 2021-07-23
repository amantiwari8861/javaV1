class vehicle
{
    int modelno;//instance variable
    int speed;//instance variable
    String modelname;//instance variable
    void accelerate(String modelname2)
    {
        modelname=modelname2;
        System.out.println("starting the vehicle of model name :"+modelname);
    }
}
public class class1 {
public static void main(String[] args) {
    vehicle Mercedese=new vehicle();//reference variable (mercedese)
    vehicle bike=new vehicle();//reference variable (bike)
    Mercedese.accelerate("mercedese benz");
    System.out.println("--------------------------");
    bike.accelerate("hero honda bike");
}  
} 