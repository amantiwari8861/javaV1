import java.util.List;

class Building
{
    int noOfRooms;
    String address;

    Building(int r)
    {
        noOfRooms=r;
    }
    void setupUtil()
    {
        System.out.println("setting up utilities in "+noOfRooms+" Rooms");
    }
}

class Main
{
    public static void main(String[] args) {
        
        Building ishantKiBuilding=new Building(20);
        Building amanKiBuilding=new Building(1000);

        ishantKiBuilding.setupUtil();
        amanKiBuilding.setupUtil();

        List l=new ArrayList(); 
        l.add(100);
        

    }
}