class Building
{
    int height;
    int width;
    Building(){System.out.println("default constructor ");}
    Building(int h,int w)
    {
        height=h;
        width=w;
    }
    void labour()
    {
        System.out.println("the height is "+height);
        System.out.println("the width is "+width);
    }
}
class run
{
    public static void main(String args[])
    {
        Building building1=new Building(100,200);
        Building building=new Building();
        building1.labour();
        building.labour();

    }
}