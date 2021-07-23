 class Parentz
{
    public void normalData()
    {
        System.out.println("public fxn");
    }
    protected void property()
    {
        System.out.println("hello i am protected fxn in parent ");
    }
    private void creditCardDetails() {
        System.out.println("credit card details accesed ");
    }
}
class Child2 extends Parentz
{
    Child2(){}
}
public class Main4 {
public static void main(String[] args) {
    Child2 obj=new Child2();
   obj.normalData();
    obj.property();
//    obj.creditCardDetails();
}
}