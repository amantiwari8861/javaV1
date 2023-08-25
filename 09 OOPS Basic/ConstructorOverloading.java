class Shape
{
    float x;
    float y;
    float z;
    String name;
    Shape()
    {
        System.out.println(" no shape defined ");
    }
    Shape(float len)
    {
        x=len;
    }
    Shape(float n1,float n2)
    {
        x=n1;
        y=n2;
    }
    Shape(double n1,double n2)
    {
        x=(float)n1;
        y=(float)n2;
    }
    Shape(float n1,float n2,String sname)
    {
        x=n1;
        y=n2;
        name=sname;
    }

    void showDetails()
    {
        System.out.println(" Shape is "+name);
        System.out.println(" X = "+x);
        System.out.println(" Y = "+y);
        System.out.println(" Z = "+z);
    }
}
public class ConstructorOverloading {

    public static void main(String[] args) {
        
        // Shape s1=new Shape();
        // s1.showDetails();
        
        // Shape line=new Shape(5.5f);
        // line.showDetails();

        Shape rect=new Shape(1.5f,6.3f,"Rectangle");
        rect.showDetails();

        //to perform overloading the no. of argument or the data type of argument must be different
    }
}