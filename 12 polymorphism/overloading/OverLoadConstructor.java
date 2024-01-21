class Shape
{
    double x,y,z;
    String shapeName;
    Shape()
    {
        System.out.println("no shape defined");
    }
    Shape(double x)
    {
        System.out.println("1D shape defined");
        this.x=x;
    }
    Shape(double x,double y)
    {
        System.out.println("2D shape defined");
        this.x=x;
        this.y=y;
    }
    Shape(double x,double y,double z)
    {
        System.out.println("3D shape defined");
        this.x=x;
        this.y=y;
        this.z=z;
    }
    void showShapeDetails()
    {
        System.out.println(shapeName+" Details");
        System.out.println(" X = "+x);
        System.out.println(" Y = "+y);
        System.out.println(" Z = "+z);
    }
}
public class OverLoadConstructor 
{
    public static void main(String[] args) 
    {
        //Aptitude
        //Technical (DSA) + CP
        //OOPs + SOLID principles & design pattern
        //OS,Networking and DBMS
        //System Design (low level design)

        Shape s1=new Shape(15.5);
        s1.shapeName="line";
        s1.showShapeDetails();

        Shape s2=new Shape(15.5,56.7);
        s2.shapeName="rectangle";
        s2.showShapeDetails();

        Shape s3=new Shape(15.5,56.7,12.7);
        s3.shapeName="cuboid";
        s3.showShapeDetails();

    }
}