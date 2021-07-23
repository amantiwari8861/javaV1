class A
{
    void Afxn()  //hidden
    {
        System.out.println("Afxn in Parent ");
    }
}
class B extends A
{
    void Afxn()
    {
        System.out.println("Afxn in child ");
    } 
    void Display()
    {
        Afxn();
        super.Afxn();
    }
}
public class superkeyword2 {
public static void main(String[] args) {

    B obj=new B();
    obj.Display();
}   
}