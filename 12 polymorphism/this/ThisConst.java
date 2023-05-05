class Shape 
{
    int height, width;// instance variable (global variables)
    String name;
    String shapeType;

    Shape() 
    {
        System.out.println("hello i am default shape");
        shapeType = "2D";
    }
    Shape(int height, int width)// local variable
    {
        this();
        System.out.println("hello i am 2 parameterized shape");
        // height=height;// here this statement is ambigious due to it's name
        this.height = height;// this means current class object
        this.width = width;// here left value is global and right value is local
    }
    Shape(int height, int width, String name) 
    {
        this(height,width);// calling 2 parameterized constructor
        // this.height = height;
        // this.width = width;
        this.name = name;
        System.out.println("hello i am 3 parameterized constructor");
    }
    void ShowDetails() 
    {
        System.out.println("the height is " + height);
        System.out.println("the width is " + width);
        System.out.println("the name is " + name);
        System.out.println("the Shape type is " + shapeType);
    }
}

public class ThisConst {
    public static void main(String[] args) {

        // Shape s = new Shape();
        // s.ShowDetails();

        // Shape s2 = new Shape(2, 4);
        // s2.ShowDetails();

        Shape s3 = new Shape(3, 5, "rectangle");
        s3.ShowDetails();
    }
}