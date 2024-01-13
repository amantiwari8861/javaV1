import java.util.Scanner;

public class Student 
{
    int stId;
    String name;
    long phoneNo;
    long aadharNo;
    String nationality;
    String qualification[];

    Address localAddress; //user defined variable
    Address permanentAddress; // has-a relationship
    
    //a student has an local address (Association,Aggregation are types of has-a)
    //a student has an permanent address

    public Student() {
        nationality="indian";
        localAddress=new Address();
        permanentAddress=new Address();
    }

    public Student(int stId, String name, long phoneNo, long aadharNo, String[] qualification) 
    {
        this.stId = stId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.aadharNo = aadharNo;
        this.qualification = qualification;
    }
    void inputDetails(Scanner sc)
    {
        System.out.println("\n****** Enter Student Details ********");
        System.out.print("Enter Student Id :");
        stId=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name :");
        name=sc.nextLine();
        System.out.print("Enter Student Phone No :");
        phoneNo=sc.nextLong();
        System.out.print("Enter Student AadharNo :");
        aadharNo=sc.nextLong();
        sc.nextLine();
        System.out.print("\n********Enter ur Local Address ***************");
        localAddress.inputAddress(sc);        
        System.out.print("\n********Enter ur Permanent Address **************");
        permanentAddress.inputAddress(sc);
        
    }
    void showStudentDetails()
    {
        System.out.println("------------------------------------");
        System.out.println("stId : "+stId);
        System.out.println("name : "+name);
        System.out.println("phoneNo : "+phoneNo);
        System.out.println("aadharNo : "+aadharNo);
        System.out.println("Nationality : "+nationality);

        System.out.print("Local Address : ");
        System.out.print(localAddress.locality+",");
        System.out.print(localAddress.city+",");
        System.out.print(localAddress.state+",");
        System.out.println(localAddress.country);

        System.out.print("Permanent Address : ");
        System.out.print(permanentAddress.locality+",");
        System.out.print(permanentAddress.city+",");
        System.out.print(permanentAddress.state+",");
        System.out.println(permanentAddress.country);

    }
}