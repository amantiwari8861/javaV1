//inheritance
//SIGLE MUTILEVEL HEIRARCHICAL
class A
{
    int num1=10;
    void fxn1()
    {
        System.out.println("hello i am grand parent "+num1);
    }
}
class B extends A
{
    int num2=100;
    void fxn2()
    {
        System.out.println("hello i am parent "+num2);
    }
}
class c extends B
{
    int num3=100;
    void fxn3()
    {
        System.out.println("hello i am Child "+num3);
    }
}
public class inherit1 extends c
{

    public static void main(String[] args) {
        inherit1 obj=new inherit1();
        obj.fxn1();
        obj.fxn2();
        obj.fxn3();
    }
}