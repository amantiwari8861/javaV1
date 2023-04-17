class Dem
{
    int var,var2;
    void Demfxn(int abc1,int abc2)
    {
        var=abc1;
        var2=abc2;
        int var3=var+var2;
        System.out.println("the value of var3 is "+var3);
    }
    void xyx()
    {
        // System.out.println("the value of var3 is "+var3+" "+var);
        System.out.println("the value of var3 is vfvvvj "+var+" "+var2);
    }
}
class main4
{
    public static void main(String args[])
    {
        Dem obj=new Dem();
        obj.Demfxn(50,60);
        obj.xyx();
    }
}