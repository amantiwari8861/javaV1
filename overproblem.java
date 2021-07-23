class Shape
{
    void drawShape(int length,int breadth)//2 argument or parameter
    {
        System.out.println("drawing Rectangle with "+length+" and "+breadth);
    }
    void drawShape(double l,int b)//2 argument or parameter
    {
        System.out.println("drawing 2nd fxn with "+l+" and "+b);
    }
    // double drawShape(double l,int b)//2 argument or parameter
    // {
    //     System.out.println("drawing 2nd fxn with "+l+" and "+b);
        //return type of fxn doesn't play any role in overloading
    //     return l+b;
    // }
}
class Main
{
    public static void main(String[] args) {
        Shape obj=new Shape();
        obj.drawShape(10L,20);
        // double sum=obj.drawShape(10L,20); error
        // System.out.println("sum = "+sum);error
        // obj.drawShape(50,101);
        //float f/F
        //double l/L
        //byte b/0b(prefix)
    }
}
