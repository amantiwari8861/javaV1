class Building
{
    String owner;
    int floors;
    int rooms;
    String address;

    Building()
    {
        owner="Aman";
    }
    Building(int floors)
    {
        owner="Aman";
        this.floors=floors;
    }
    Building(int floors,int rooms)
    {
        owner="Aman";
        this.floors=floors;
        this.rooms=rooms;
    }
    Building(int floors,int rooms,String address)
    {
        owner="Aman";
        this.floors=floors;
        this.rooms=rooms;
        this.address=address;
    }

    void showDetails()
    {
        System.out.println("Owner :"+owner);
        System.out.println("Floors :"+floors);
        System.out.println("Rooms :"+rooms);
        System.out.println("Address :"+address);
    }
}
public class BeforeChaining 
{
    public static void main(String[] args) {
        
    }
}