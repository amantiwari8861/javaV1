import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month no.");
        int dNum=sc.nextInt();

        if(dNum==1 ||dNum==3 ||dNum==5 ||dNum==7 ||dNum==8 ||dNum==10  || dNum==12 )
        {
            System.out.println("31 Days ");
        }
        else if(dNum==2)
        {
            System.out.println("Enter year of February");
            int year=sc.nextInt();
            if(year%4==0 && year%100 !=0 || year%400 ==0)
            {
                System.out.println("29 days");
            }
            else
            {
                System.out.println("28 days");
            }
        }
        else
        {
            System.out.println("30 days");
        }
    }
}
