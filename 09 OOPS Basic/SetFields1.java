//Type 1
class Building
{
    int floors;
    int rooms;
    String address="Noida 62";
    String owner;

}
public class SetFields1 
{
    public static void main(String[] args) 
    {
        
        Building building1=new Building();

        building1.floors=3;
        int floors=building1.floors;

        System.out.println("Floors in B1 :"+floors);
        System.out.println("Floors in B1 :"+building1.floors);
        building1.address="Delhi";
        System.out.println("Address of B1 :"+building1.address);


        Building building2=new Building();

        System.out.println("Floors in B2 :"+building2.floors);
        System.out.println("Address of B2 :"+building2.address);


    }
}
