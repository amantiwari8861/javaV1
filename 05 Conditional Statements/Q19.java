import java.util.Scanner;

public class Q19 {

    public static void main(String[] args) {
        
//19. Write a program in Java to calculate and print the Electricity bill of a given customer. 
// The customer id, customer name and unit consumed by the user should be taken from the keyboard
//  and display the total amount to pay to the customer. The charge are as follow : 
// Unit	Charge/unit
// upto 199	@3.20
// 200 and above but less than 400	@5.50
// 400 and above but less than 600	@8.80
// 600 and above	@9.00
// If bill exceeds Rs. 1500 then a surcharge of 18% will be charged and the minimum bill should be of Rs. 100/-

        Scanner sc=new Scanner(System.in);
        int id;
        String name;
        double unit,amount,surcharge,netamount=0;

        System.out.println("Enter ur id :");
        id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name :");
        name=sc.nextLine();
        System.out.println("Unit consumed :");
        unit=sc.nextDouble();

        if (unit<200) 
        {
            amount=unit*3.20;
        }
        else if(unit>=200 && unit<400 )
        {
            amount=unit*5.50;
        }
        else if(unit>=400 && unit<600 )
        {
            amount=unit*8.80;
        }
        else
        {
            amount=unit*9;
        }
        
        if (amount<100) {
            amount=100;
        }

        if (amount>1800) {
            
            surcharge=amount*18/100;
            netamount=amount+surcharge;
            System.out.println("Ur amount is :"+amount);
            System.out.println("Ur Surcharge is :"+surcharge);
        }
        else
        {
            netamount=amount;
        }
        System.out.println(id+" Dear "+name+" Sir/Ma'am ur net amount is :"+netamount);

    }
}