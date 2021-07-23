class Parent
{
    void parentfxn()
    {
        System.out.println("hello i m parent fxn ");
    }
}
class Child extends Parent
{
    void childfxn()
    {
        System.out.println("hello i am child fxn ");
    }
}
class run
{
    public static void main(String args[])
    {
        Child obj=new Child();
        obj.parentfxn();
        obj.childfxn();
    }
}