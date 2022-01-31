// what is the difference between constructor and methods?
class Polygon
{
    int width, height;
    Polygon(){System.out.println("default constructor called");}
    Polygon(){} //compiler implicitly makes this constructor
    Polygon(int a, int b)
    {
        width = a;
        height = b;
        // System.out.println("Polygon constructor called with width = " + width + " and height = " + height);
    }
    void showDim()
    {
        System.out.println("Width: " + width + " Height: " + height);
    }
}
public class PracticeConstructor {
    public static void main(String[] args) 
    {
        // Polygon p = new Polygon(5, 7); //instansiation of class Polygon
        //class is also an userdefined data type
        // Polygon q; // q is a reference variable
        // new Polygon(15,17); // this is object creation
        // q=new Polygon(15,17);
        // q.showDim();

        new Polygon(25,27).showDim(); // also valid
        Polygon r = new Polygon();
    }
}