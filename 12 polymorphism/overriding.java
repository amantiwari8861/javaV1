class A
{
    void fxn()  //hidden
    {
        System.out.println("A fxn in Parent ");
    }
    void parentFxn(){System.out.println("Parent fxn");}
}
class B extends A
{
    void fxn()
    {
        System.out.println("A fxn in child ");
    }
    void childFxn(){System.out.println("child fxn");}
}
public class overriding {

    public static void main(String[] args) 
    {
        // B obj=new B();
        // obj.fxn();

        // A obj2=new A();
        // obj2.fxn();

        A obj=new B();
        obj.fxn();
        obj.parentFxn();
        // obj.childFxn();//error

    }
}