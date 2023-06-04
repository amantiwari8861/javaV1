class Building
{
    int rooms;//global variable (instance variable)
    Building()
    {
        System.out.println("Hello i am default Constructor");
    }
    Building(int r)
    {
        // r is local variable
        rooms=r;
    }
    void showBuildingDetails()
    {
        System.out.println("Rooms :"+rooms);
    }
}
public class Temp {
    public static void main(String[] args) 
    {
        Building c=new Building();
        c.showBuildingDetails();

        Building b=new Building(10);
        b.showBuildingDetails();
    }
}
