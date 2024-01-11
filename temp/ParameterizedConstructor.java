import java.util.Scanner;

class Building 
{
    int floors;
    int noOfRooms;
    boolean isLiftAvailable;
    double height;
    double width;
    String ownerName;

    // Building() //default constructor
    // {
    //     System.out.println("default constructor called");
    //     floors=10;
    //     noOfRooms=50;
    // }
    // Building(int f,int r,boolean b,double h,double w,String o)
    // {
    //     System.out.println("parameterized constructor called");
    //     floors=f;
    //     noOfRooms=r;
    //     isLiftAvailable=b;
    //     height=h;
    //     width=w;
    //     ownerName=o;
    // }
    void showBuildingDetails()
    {
        System.out.println("\n********* Building Details *****************");
        System.out.println("No. of Floors :"+floors);
        System.out.println("No. of Rooms :"+noOfRooms);
        System.out.println("Lift Available :"+isLiftAvailable);
        System.out.println("Height :"+height);
        System.out.println("Width :"+width);
        System.out.println("Owner Name :"+ownerName);
        System.out.println("***********************************************");
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        

        Building b1=new Building();
        b1.floors=12;
        b1.showBuildingDetails();

        // Building b2=new Building(10,50,true,1200,2800,"Aman Tiwari");
        // b2.showBuildingDetails();

        // Building b3=new Building(20,100,true,2200,4800,"Ravi Chauhan");
        // b3.showBuildingDetails();

    }
}