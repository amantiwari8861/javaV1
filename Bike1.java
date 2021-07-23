class Bike
{
    void Creation()
    {
        System.out.println("Creating a Bike ");       
    }
}
class Kawasaki extends Bike
{
    void Creation()
    {
        System.out.println("Creating a Kawasaki zx 10R ");       
    }
}
class Main3
{
    public static void main(String[] args) {
        // Kawasaki obj=new Kawasaki();
         Bike obj2=new Bike();
        Bike obj=new Kawasaki();
        obj.Creation();
        obj2.Creation();
    }
}