import java.util.Scanner;

//Type 2
class Building
{
    int floors;//instance variable
    int rooms;//instance variable
    String address="Noida 62";//instance variable
    String owner;//instance variable
    Scanner sc=new Scanner(System.in);//instance variable
    void setData()
    {
        System.out.println("Enter floors");
        floors=sc.nextInt();
    }
    void getDetails()
    {
        System.out.println("Floors :"+floors);
        System.out.println("Rooms :"+rooms);
        System.out.println("Address :"+address);
        System.out.println("Owner :"+owner);
    }
}
public class SetFields2 {
    public static void main(String[] args) {
        
        Building building=new Building();

        building.setData();
        System.out.println("there are "+building.floors+" floors in building1");

        building.getDetails();
    }
}
