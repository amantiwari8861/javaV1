class Shape
{
    int height,breadth,length;
    Shape( int breadth,int length)
    {
        System.out.println("i am a polygon with length "+length+"and breadth "+breadth);
    }
     Shape(int height,int length,int breadth)
    {
        System.out.println("i am a polygon with length "+length+" and breadth "+breadth+"and height "+height);
    }
}
class Main2
{
    public static void main(String[] args) {
        Shape obj=new Shape(100,200); //may be rectangle ,square or any 2d shape 
        Shape obj2=new Shape(100,200,50);//may be cone,cylinder or any 3d shape 
    }
}