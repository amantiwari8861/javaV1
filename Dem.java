class Dem
{
    int var;
    void Demfxn()
    {
        System.out.println("hello i am demo class function ");
    }
}
class main4
{
    public static void main(String args[])
    {
        Dem obj=new Dem();
        System.out.println("hello i am before  Demfxn in main fxn");
        obj.Demfxn();
        System.out.println("hello i am after Demfxn in main fxn");
    }
}