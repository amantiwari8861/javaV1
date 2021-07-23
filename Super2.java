class Parentz
{
    Parentz()
    {
        System.out.println("parent class constructor ");
    }
    int num=50;
    void fxn()
    {
        System.out.println("hello i am parent fxn ");
    }
}
class childz extends Parentz
{
    childz()
    {
        super(); //implicitly child calls parent class constructor super must be 1st statement in constructor
        System.out.println("child class constructor ");
        //super(); error
    }
    int num=10;
    void fxn()
    {
        System.out.println("hello i am childz fxn ");
    }
    void showDetails()
    {
        System.out.println("num in child  = "+num+"\n num in parent "+super.num);
        fxn();
        super.fxn();
    }
}
class Main
{
    public static void main(String[] args) {
        childz objChildz=new childz();
        objChildz.showDetails();
    }
}