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
    // B(){ }
}
public class overriding {

    public static void main(String[] args) {
        // B obj=new B();
        // obj.Afxn();
        // A obj2=new A();
        // obj2.Afxn();
        A obj=new B();
        obj.Afxn();// child
        A obj2=new A();
        obj2.Afxn();//parent
    }
}