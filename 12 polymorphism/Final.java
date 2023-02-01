class Bank
{
    final float PI=3.14f;
    final int id;
    Bank()
    {
        // id=200;
    }
    void change()
    {
        // PI=5.17f;
        id=56;
    }
    final void show()
    {
        System.out.println("Hello");
    }
}
final class SBI extends Bank
{
    void show()
    {
        System.out.println("hii");
    }
}
class Punjab extends SBI 
{

}
public class Final {

    
}