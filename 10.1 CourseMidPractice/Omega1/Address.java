import java.util.Scanner;

public class Address 
{
    String city;
    String state;
    int pincode;
    String country;
    String locality;
    public Address() {
    }
    public Address(String state, String city, int pincode, String country, String locality) {
        this.state = state;
        this.city = city;
        this.pincode = pincode;
        this.country = country;
        this.locality = locality;
    }
    void inputAddress(Scanner sc)
    {
        System.out.print("Enter city:");
        city=sc.nextLine();
        System.out.print("Enter State:");
        state=sc.nextLine();
        System.out.print("Enter Pincode:");
        pincode=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter locality:");
        locality=sc.nextLine();
        System.out.print("Enter Country:");
        country=sc.nextLine();
    }
    void showAddress()
    {
        System.out.println("*********** Address Details **********");
        System.out.println("city :"+city);
        System.out.println("state :"+state);
        System.out.println("pincode :"+pincode);
        System.out.println("country :"+country);
        System.out.println("locality :"+locality);
    }
}
