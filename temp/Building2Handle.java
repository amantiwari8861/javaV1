import java.util.Scanner;

class Building2
{
    int noOfRooms;
    String ownerName;
    int floors;//instance variable
    Building2()
    {
        System.out.println("blank building constructed");
    }
    Building2(int nr,String ow,int floors)
    {
        noOfRooms=nr;
        ownerName=ow;
        this.floors=floors;//this represents to current class object
    }

    // void inputDetails()
    // {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter Building details :");
    //     System.out.print("Enter no of rooms :");
    //     noOfRooms=sc.nextInt();
    //     sc.nextLine();
    //     System.out.print("Enter Owner Name :");
    //     ownerName=sc.nextLine();
    //     System.out.print("Enter no of floors :");
    //     floors=sc.nextInt();
    // }
    void showDetails()
    {
        System.out.println("All Details of building ");
        System.out.println("owner Name :"+ownerName);
        System.out.println("No of rooms :"+noOfRooms);
        System.out.println("No of floors :"+floors);
    }
}
public class Building2Handle {
    public static void main(String[] args) {
        
        // Building2 b2=new Building2();
        // b2.inputDetails();
        // b2.showDetails();

        // Building2 b2=new Building2(50, "AMan Tiwari", 5);
        // b2.showDetails();

        Building2 b3=new Building2(100, "Satish Tiwari", 7);
        b3.showDetails();

        Building2 b4=new Building2();
        b4.noOfRooms=55;
        b4.ownerName="alka";
        b4.floors=5;

        // b4.showDetails();
        System.out.println(b4.ownerName);
        System.out.println(b4.floors);
    }
}