public class testprotected
{
    protected int i=500;
    // public int i=500;
    protected void fxn()
    // public void fxn()
    {
        System.out.println("i am protected fxn "+i);
    }
}
class Main 
{
    public static void main(String[] args) {
        testprotected obj=new testprotected();
        obj.fxn();
        System.out.println(obj.i);
    }
}