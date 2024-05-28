import java.util.Scanner;

class Q19
{
    public static void main(String[] args) {
     
        Scanner sc =new Scanner(System.in);

        System.out.println("enter customer id:");
        int custId=sc.nextInt();
        sc.nextLine();
        System.out.println("enter customer name:");
        String custNamme=sc.nextLine();
        System.out.println("enter unit consumed:");
        int unit=sc.nextInt();
        double amount=0,surcharge;
        if (unit>=0 && unit<200) 
        {
            amount=unit*3.20;
        }
        else if (unit>=200 && unit<400) 
        {
            amount=unit*5.50;
        }
        else if (unit>=400 && unit<600) 
        {
            amount=unit*8.80;
        }
        else if (unit>=600) 
        {
            amount=unit*9.0;
        }
        else
        {
            System.out.println("negative unit not allowed");
        }

        if (amount>1000) 
        {
            surcharge=amount*0.15;
            amount+=surcharge;
            System.out.println("15% surcharge added :"+surcharge);
        }
        if (amount<200) {
            amount=200;
            System.out.println("amount must be greater than 200");
        }

        System.out.println("the final amount is :"+amount);
        
        sc.close();
    }
}