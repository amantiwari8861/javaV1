import java.util.Scanner;

public class UserDetails {

    public static void main(String[] args) {
        
        String name,address,city;
        double salary;
        int pincode;
        long mobile;
        boolean isMarried;
        char gender;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter ur Name :");
        name=sc.nextLine();
        
        System.out.print("Enter ur Address :");
        address=sc.nextLine();
        
        System.out.print("Enter ur City :");
        city=sc.nextLine();

        
        System.out.print("Enter ur Salary :");
        salary=sc.nextDouble();

        System.out.print("Enter ur Pincode :");
        pincode=sc.nextInt();

        System.out.print("Enter ur mobile No :");
        mobile=sc.nextLong();

        System.out.print("Enter ur Gender(M/F/O) :");
        gender=sc.next().charAt(0);

        System.out.print(" Are u married ?(true/false) :");
        isMarried=sc.nextBoolean();
        
        
        System.out.println("***********User Details*****************");
        System.out.println("Name :"+name);
        System.out.println("Address :"+address);
        System.out.println("City :"+city);
        System.out.println("Pincode :"+pincode);
        System.out.println("Mobile No. :"+mobile);
        System.out.println("Salary :"+salary);
        System.out.println("Gender :"+gender);
        System.out.println(" Married ? :"+isMarried);

    }
}