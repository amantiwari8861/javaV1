import java.util.Scanner;

class Ticket 
{
    String name;
    String source;
    String destination;
    double fare;

    Ticket(String name, String source, String destn, double price) 
    {
        //here local variables are name,source,destn and price
        //here instance variables are name,source,destination and fare
        name = name;// is local variable's values is assigning into instance variable or vice versa
        this.source = source;//this represents to current class object i.e here this.source represents instance variable
        destination = destn;
        fare = price;
    }
    void showDetails()
    {
        System.out.println(" ****************** Ticket Details *****************");
        System.out.println("Name :"+name);
        System.out.println("Source :"+source);
        System.out.println("Destination :"+destination);
        System.out.println("Fare :"+fare);
    }
}
public class TicketMain
{
    public static void main(String[] args) 
    {
        // Ticket t1=new Ticket("kamal Nain", "Delhi", "banglore", 1000);
        // t1.showDetails();

        Scanner sc=new Scanner(System.in);
        Ticket t;//reference variable of class Ticket
        System.out.println("Enter Ticket details");
        System.out.print("Enter Name:");
        String name=sc.nextLine();
        System.out.print("Enter Source:");
        String s=sc.nextLine();
        System.out.print("Enter Destn:");
        String d=sc.nextLine();
        System.out.print("Enter Price:");
        double p=sc.nextDouble();

        t=new Ticket(name, s, d, p);//object of Ticket
        t.showDetails();


    }   
}