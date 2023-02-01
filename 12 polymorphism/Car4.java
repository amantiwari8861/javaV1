class Car4
{
    static int tyres=4;  //instance variable
    static void accelerate()
    {
        System.out.println("running car");
    }
    public static void main(String[] args) {

        // Car4 oCar=new Car4();
        // System.out.println(" tyres = "+oCar.tyres);
        // oCar.accelerate();
        System.out.println(tyres);
        accelerate();
        // System.out.println(tyre.tyres2);
        //static or object
        tyre object3=new tyre();
        System.out.println(object3.tyres2);
    }
}
class tyre
{
    // static int tyres2=10;
    int tyres2=10;
}
