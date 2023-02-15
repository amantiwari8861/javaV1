import java.util.Scanner;

interface RBI 
{
    float maxInterestRate=12;//public static final by default
    void showInterestRate();//public abstract by default
}
class SBI implements RBI
{
    @Override
    public void showInterestRate() 
    {
        // maxInterestRate=9;//error bcz this is final
        System.out.println("our interest rate is 9%");
        System.out.println("RBI's max interest rate is "+maxInterestRate);
        System.out.println("RBI's max interest rate is "+RBI.maxInterestRate);//bcz it is static
    }
}
class PNB implements RBI
{
    @Override
    public void showInterestRate() 
    {
        System.out.println("our interest rate is 7%");
        System.out.println("RBI's max interest rate is "+RBI.maxInterestRate);//bcz it is static
    }
}
public class InterfaceDemo 
{
    public static void main(String[] args) 
    {
        // SBI b=new SBI();//can't instantiated
        // SBI s=new SBI();
        // s.showInterestRate();

        Scanner sc=new Scanner(System.in);
        System.out.println("which bank's interest rate u want to know ?");
        String bank=sc.nextLine();

        RBI rbi=null;//declaring reference variable
        if (bank.equalsIgnoreCase("SBI")) 
        {
            rbi=new SBI();//overriding or loose coupling
        }
        else if(bank.equalsIgnoreCase("PNB"))
        {
            rbi=new PNB();//overriding or loose coupling
        }
        else
        {
            System.out.println("invalid bank name");
        }
        
        char choice;
        System.out.println("would you like to see interest rate ? [y/n] ");
        choice=sc.next().charAt(0);
        if (choice == 'Y' || choice== 'y')
        {
            rbi.showInterestRate();
        }
        sc.close();
    }
}
