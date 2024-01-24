import java.util.Scanner;

public class Ques19 {

    public static void main(String[] args) {
        
        int id;
        String name;
        double unit,netAmnt=0,surcharge;
        Scanner sc=new Scanner(System.in);

        System.out.print("enter id:");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("enter Name:");
        name=sc.nextLine();
        System.out.print("enter Unit Consumed per month:");
        unit=sc.nextDouble();

        if (unit>=0 && unit<200) 
        {
            netAmnt=unit*3.20;
        }
        else if(unit>=200 && unit<400)
        {
            netAmnt=unit*5.50;
        }
        else if(unit>=400 && unit<600)
        {
            netAmnt=unit*8.80;
        }
        else if(unit>=600)
        {
            netAmnt=unit*9.0;
        }
        else 
        {
            System.out.println("invalid unit!");
        }
        System.out.println("The amount is "+netAmnt);
        if (netAmnt>1000) 
        {
            surcharge=netAmnt*15.0/100.0;
            netAmnt=netAmnt+surcharge;
            System.out.println("+Added surcharge @15%:"+surcharge);
        }
        if (netAmnt<200) 
        {
            netAmnt=200;
            System.out.println("Minimum Amount should be "+200);
        }
        System.out.println("Your final Amount is :"+netAmnt);
    }
}