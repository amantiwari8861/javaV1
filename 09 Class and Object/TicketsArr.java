import java.util.Scanner;

class Ticket 
{
    String name;
    String source;
    String destination;
    double fare;

    Ticket(String name, String source, String destn, double price) 
    {
        this.name = name;
        this.source = source;
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
public class TicketsArr
{
    public static void main(String[] args) 
    {
        int totalTicket;
        Ticket tarr[];//reference array of class Ticket
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of tickets :");
        totalTicket=sc.nextInt();
        tarr=new Ticket[totalTicket];//providing memory according to user
        for (int i = 0; i < tarr.length; i++) 
        {
            sc.nextLine();
            System.out.println("********* Enter "+(i+1)+" Ticket details ********");
            System.out.print("Enter Name:");
            String name=sc.nextLine();
            System.out.print("Enter Source:");
            String s=sc.nextLine();
            System.out.print("Enter Destn:");
            String d=sc.nextLine();
            System.out.print("Enter Price:");
            double p=sc.nextDouble();
            tarr[i]=new Ticket(name, s, d, p);//object of Ticket
        }
        System.out.println("******** Total Tickets Details ***********");
        for (int i = 0; i < tarr.length; i++) 
        {
            tarr[i].showDetails();
        }
    }   
}