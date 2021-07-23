// in method overloading the no. of arguments(parameters) and the data type of arguments must be different 
class Shape
{
    //function overloading
    void drawShape()//0 argument or parameter
    {
        System.out.println("hello i am normal fxn");
    }
    void drawShape(int length,int breadth)//2 argument or parameter
    {
        System.out.println("drawing Rectangle with "+length+" and "+breadth);
    }
    void drawShape(char ch,int b)//2 argument or parameter
    {
        System.out.println("drawing 2nd fxn with "+ch+" and "+b);
    }
}
class Main
{
    public static void main(String[] args) {
        Shape obj=new Shape();
        obj.drawShape();
        obj.drawShape(10,20);
        obj.drawShape('A',101);
    }
}
