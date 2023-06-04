class Building
{
    String owner;
    int floors;
    int rooms;
    String address;
    boolean isLiftAvailable;

    Building()
    {
        owner="Aman";
    }
    Building(int floors)
    {
        this();
        this.floors=floors;
    }
    Building(int floors,int rooms)
    {
        this(floors);
        this.rooms=rooms;
    }
    Building(int floors,int rooms,String address)
    {
        this(floors, rooms);
        this.address=address;
    }
    Building(int floors, int rooms, String address, boolean isLiftAvailable) 
    {
        this(floors, rooms, address);
        this.isLiftAvailable = isLiftAvailable;
    }
    void showDetails()
    {
        System.out.println("Owner :"+owner);
        System.out.println("Floors :"+floors);
        System.out.println("Rooms :"+rooms);
        System.out.println("Address :"+address);
        System.out.println("lift available :"+isLiftAvailable);
    }

}


public class ChainingOfConstructor {

    public static void main(String[] args) 
    {
        Building building;

        // building=new Building();
        // building=new Building(5);
        // building=new Building(5, 50);
        // building=new Building(3, 50, "noida");
        building=new Building( 6, 10, "Delhi", true);
        building.showDetails();

    }
}