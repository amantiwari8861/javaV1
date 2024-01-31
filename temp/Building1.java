import java.util.Scanner;

class Building  //blue-print
{
    //attributes = data = variable = fields = states
    //behaviour = method = function 
    int noOfRooms=50;
    double height;
    String address;
    Building()
    {
        System.out.println("Constructing the building");
    }
    void manageUtilities()
    {
        System.out.println("managing utilities in "+noOfRooms+" Rooms");
    }
}
public class Building1 
{
    public static void main(String[] args) 
    {
        Building alkaKiBuilding=new Building();
        //alkaKiBuilding.manageUtilities();
        alkaKiBuilding.noOfRooms=20;
        alkaKiBuilding.manageUtilities();
        System.out.println(alkaKiBuilding);

        // new Building();
        Building satishKiBuilding=new Building();
        satishKiBuilding.manageUtilities();
        System.out.println(satishKiBuilding);

        // Scanner sc=new Scanner(System.in);
        // Scanner sc2; //reference(address) variable
        // new Scanner(System.in); //object

    }
}