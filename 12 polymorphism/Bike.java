class Bike {
    int var=30;
    int var2=50;
    void accelerate()
    {
        System.out.println("hello i am Bike1 fxn");
    }
}
class Bike2 extends Bike{
    int var=20;
    void accelerate()
    {
        System.out.println("hello i am Bike2 fxn");
    }
}
class KTM extends Bike2{
    int var=10;
    void accelerate()
    {
        super.accelerate();
        System.out.println("hello i am KTM function "+super.var);
        System.out.println("hello i am KTM function "+super.var2);
    }
   /* void abc()
    {
        super.accelerate();
    }*/
}
class Run
{
    public static void main(String[] args) {
        KTM obj=new KTM();
        obj.accelerate();
       // obj.abc();
    }
}