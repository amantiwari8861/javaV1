class Shape
{
    void show(float ch,float a)
    {
        System.out.println("hello i am float function ");
    }
    void show(double ch,double a)
    {
        System.out.println("hello i am double function ");
    }
    void show(short s)
    {
        System.out.println("Short");
    }
    void show(int s)
    {
        System.out.println("Int");
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) 
    {
        Shape objShape=new Shape();
        // objShape.show(56.67f,100.988f);
        objShape.show((short)12);
    }
}