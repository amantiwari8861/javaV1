import java.util.Scanner;
class Shape
{
    int height,width;
    Shape()
    {
        System.out.println("Default constructor");
    }
    Shape(int h,int w)
    {
        height=h;
        width=w;
    }
    void area()
    {
        System.out.println("Area of the shape is :"+height*width);
    }
}
public class ConstructorDemo 
{
public static void main(String[] args) 
{
    int h,w;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the height and width of the shape");
    h=sc.nextInt();
    w=sc.nextInt();
    Shape obj=new Shape();
    // Shape obj=new Shape(h,w);
    obj.area();
    sc.close();
    //Garbage Collection is a process in which the unused objects are collected and deleted from memory
    //Robust 
}
}