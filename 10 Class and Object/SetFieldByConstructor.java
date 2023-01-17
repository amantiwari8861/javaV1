import java.util.Scanner;

//Type 3
class Building
{
    int floors;//instance variable
    int rooms;//instance variable
    String address;//instance variable
    String owner;//instance variable
    Scanner sc;//instance variable
    
    // Building(){}//this default constructor is automatically created by java 
    //constructor is a special type of method which is used to initialize the data members of a class
    Building()
    {
        System.out.println("Hello i am default constructor");
        rooms=50;
        sc=new Scanner(System.in);
        address="Noida 62";
    }
    Building(int r,int f,String o,String a)//parameterized constructor
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
public class SetFieldByConstructor {

    public static void main(String[] args) {
        
        Building sumitKiBuilding=new Building();//default constructor
        sumitKiBuilding.showBuildingDetails();

        // Building building2=new Building(10,5,"Aakash","Niit 62 noida");
        // building2.showBuildingDetails();

        Scanner sc=new Scanner(System.in);

        // System.out.println("Enter Floors");
        // int floors=sc.nextInt();
        System.out.println("Enter Rooms");
        int rooms=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Address");
        String address=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Owner");
        String owner=sc.nextLine();

        Building b3=new Building(rooms,floors,owner,address);
        b3.showBuildingDetails();
    }
}