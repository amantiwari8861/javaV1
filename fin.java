class ReadOnly
{
    final float PI=3.14f;
    final int var;  //blank final
    ReadOnly()
    {
        // var=10;
    }
    void change()
    {
        // pi=5.677f;//error
        var=50;//error
        System.out.println("the value of pi = "+PI+" "+var);
    }
}
public class fin 
{
    public static void main(String[] args)
    {
        ReadOnly obj=new ReadOnly();
        obj.change();
    }
}