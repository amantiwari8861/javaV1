abstract class abs
{
    void absfxn();
    abstract void absfxn2();
}
class child extends abs
{
    void absfxn2()
    {
        System.out.println("hello i am absfxn2 body ");
    }
    public static void main(String[] args) {
        child obj=new child();
        obj.absfxn2();
    }
}