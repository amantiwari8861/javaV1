import java.util.Scanner;

class Ticket 
{
    String name;
    String source;
    String destination;
    double fare;

    void inputDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name:");
        name=sc.nextLine();
        System.out.print("Enter Source:");
        source=sc.nextLine();
        System.out.print("Enter Destn:");
        destination=sc.nextLine();
        System.out.print("Enter Price:");
        fare=sc.nextDouble();
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
public class TicketArr2
{
    public static void main(String[] args) 
    {
        int totalTicket;
        Ticket tickets[];//reference array of class Ticket
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of tickets :");
        totalTicket=sc.nextInt();
        tickets=new Ticket[totalTicket];//providing memory according to user
        for (int i = 0; i < tickets.length; i++) 
        {
            Ticket temp=new Ticket();
            System.out.println("********* Enter "+(i+1)+" Ticket details ********");
            temp.inputDetails();
            tickets[i]=temp;
        }
        System.out.println("******** Total Tickets Details ***********");
        for (int i = 0; i < tickets.length; i++) 
        {
            tickets[i].showDetails();
        }
    }   
}