class Stat2
{
    static String name="Aman";
    int a=10;
    static void changeName()
    {
        //Stat2 obj=new Stat2();
        System.out.println("hello i am static method "+name);
        // System.out.println("hello i am static method "+name+a); error
        // System.out.println("hello i am static method "+name+obj.a);
        System.out.println("hello i am static method "+name+a);
    }
}
class run
{
    public static void main(String args[])
    {
        Stat2.changeName();
    }
}