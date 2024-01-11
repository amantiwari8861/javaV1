import java.util.Scanner;

class Building 
{
    int floors;
    int noOfRooms;
    boolean isLiftAvailable;
    double height;
    double width;
    String ownerName;

    Building()
    {
        System.out.println("default constructor called");
        floors=10;
        noOfRooms=50;
    }

    void showBuildingDetails()
    {
        System.out.println("Building Details :");
        System.out.println("No. of Floors :"+floors);
        System.out.println("No. of Rooms :"+noOfRooms);
        System.out.println("Lift Available :"+isLiftAvailable);
        System.out.println("Height :"+height);
        System.out.println("Width :"+width);
        System.out.println("Owner Name :"+ownerName);
    }
    void inputOwnerName()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter owner name :");
        ownerName=sc.nextLine();
        sc.close();
    }
}

public class BuildingHandler {
    public static void main(String[] args) {
       
        // Building khushiKiBuilding=new Building();
        // khushiKiBuilding.showBuildingDetails();

        //there are 3 ways to initialize the data members(instance variables) of a class
        //1st way 
        // khushiKiBuilding.noOfRooms=50;
        // khushiKiBuilding.showBuildingDetails();
        //2nd way
        // khushiKiBuilding.inputOwnerName();
        // khushiKiBuilding.showBuildingDetails();
        //3rd way using constructors
        // what is constructor ?
        //constructor is a special type of method which is used to initialize the data member and member functions of a class 
        //note: constructor doesn't have return type
        //      it is same name as class name
        Building khushiKiBuilding=new Building();
        khushiKiBuilding.showBuildingDetails();

    }
}