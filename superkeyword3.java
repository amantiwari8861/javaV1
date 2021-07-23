class A
{
    A()
    {
        System.out.println("A class constructor");
    }
    A(int a)
    {
        System.out.println("a = "+a);
    }
}
class B extends A
{
    B()
    {
        // super();  compiler already created a parent class object with default constructor
        super(100);
        System.out.println("B class constructor ");
    }
}
public class superkeyword3 {
public static void main(String[] args) {

    B obj=new B();
}   
}