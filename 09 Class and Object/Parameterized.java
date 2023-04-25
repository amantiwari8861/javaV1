import java.util.Scanner;

class Building
{
    int floors;//instance variable
    int rooms;//instance variable
    String address;//instance variable
    String owner;//instance variable
    
    Building()
    {
        System.out.println("Hello i am default constructor");
    }
    Building(int r,int f,String o,String a)
    {
        rooms=r;
        floors=f;
        owner=o;
        address=a;
    }
    void showBuildingDetails()
    {
        System.out.println("Floors :"+floors);
        System.out.println("Rooms :"+rooms);
        System.out.println("Address :"+address);
        System.out.println("Owner :"+owner);
    }

}


public class Parameterized {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Floors");
        String floors=sc.nextLine();
        // sc.nextLine();
        System.out.println("Enter Rooms");
        String rooms=sc.nextLine();
        // sc.nextLine();
        System.out.println("Enter Address");
        String address=sc.nextLine();
        // sc.nextLine();
        System.out.println("Enter Owner");
        String owner=sc.nextLine();
        // sc.nextLine();

        if (floors.equals("")) 
        {
            floors="0";
        }
        if(rooms.equals(""))
        {
            rooms="0";
        }
        if(owner.equals(""))
        {
            owner="null";
        }
        if(address.equals(""))
        {
            address="null";
        }

        Building b3=new Building(Integer.parseInt(rooms),Integer.parseInt(floors),owner,address);
        b3.showBuildingDetails();
    }
}
