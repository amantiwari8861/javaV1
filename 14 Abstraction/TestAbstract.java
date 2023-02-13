abstract class abs
{
    abstract void absfxn();
}
abstract class abschild extends abs
{
    abstract void absfxn2();
}
public class TestAbstract extends abschild
{
    void absfxn()
    {
        System.out.println("hello i am absfxn body ");
    }
    void absfxn2()
    {
        System.out.println("hello i am absfxn2 body ");
    }
    public static void main(String[] args) 
    {
        TestAbstract obj=new TestAbstract();
        obj.absfxn();
        obj.absfxn2();
    }
}