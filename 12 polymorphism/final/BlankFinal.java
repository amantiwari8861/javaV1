class AadharCard
{
    final long aadharNo;
    AadharCard(long aadharNo)
    {
        this.aadharNo=aadharNo;//only constructors can set the blank final variable
    }
    void showDetails()
    {
        // aadharNo=788755;
        System.out.println("Addhar No. :"+aadharNo);
    }
}
public class BlankFinal {

    public static void main(String[] args) 
    {
        AadharCard a=new AadharCard(1234567788L);
        a.showDetails();
        
    }
}