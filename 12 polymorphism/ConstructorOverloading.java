class Shape
{
    void show(/*no parameters (arguments) */)
    {
        System.out.println("hello i am a no argument function");
    }
    void show(int a,char ch)
    {
        System.out.println("hello i am single argument function " +a);
    }
    void show(char ch,int a)
    {
        System.out.println("hello i am single argument function " +a);
    }
    void show(int ch,int a)
    {
        System.out.println("hello i am single argument function " +a);
    }
    void show(double ch,double a)
    {
        System.out.println("hello i am single argument function " +a);
    }
}
public class ConstructorOverloading {

    public static void main(String[] args) {

        Shape objShape=new Shape();

        objShape.show();
        objShape.show(56d,100D);
        // Shape objShape2=new Shape();
        // System.out.println(objShape);
        // System.out.println(objShape2);
        // System.out.println(objShape2 instanceof Shape);
    }
}