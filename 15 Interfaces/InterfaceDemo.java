import java.util.Scanner;

interface RBI 
{
    float MAX_INTEREST_RATE=12;//public static final by default
    void showInterestRate();//public abstract by default
}
class SBI implements RBI
{
    @Override
    public void showInterestRate() 
    {
        // MAX_INTEREST_RATE=19;//error bcz this is final
        System.out.println("our interest rate is 9%");
        System.out.println("RBI's max interest rate is "+MAX_INTEREST_RATE);
        System.out.println("RBI's max interest rate is "+RBI.MAX_INTEREST_RATE);//bcz it is static
    }
}
class PNB implements RBI
{
    @Override
    public void showInterestRate() 
    {
        System.out.println("our interest rate is 7%");
        System.out.println("RBI's max interest rate is "+RBI.MAX_INTEREST_RATE);//bcz it is static
    }
}
public class InterfaceDemo 
{
    public static void main(String[] args) 
    {
        // RBI b=new RBI();//can't instantiated
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
        
        if(rbi != null)
            rbi.showInterestRate();
        
        sc.close();
    }
}
