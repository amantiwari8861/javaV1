final class Parent
{
    void parentFxn()
    {
        System.out.println("parent fxn");
    }
}
class Child extends Parent
{
    void childFxn()
    {
        System.out.println("child fxn ");
    }
}
public class Fin2 {

    public static void main(String[] args) {
        Child obj=new Child();        
    }
}