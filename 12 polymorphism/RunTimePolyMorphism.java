class Parent
{
    long creditCardNo;
    int cvv;
    String name;
    Parent()
    {
        creditCardNo=12345678;
        cvv=123;
        name="Krishna Bisht";
    }
    void Building()
    {
        System.out.println("Building Created by Parent ");
    }
    void changeCreditCardDetails()
    {
        System.out.println("changing CC details");
    }
}
class Child extends Parent
{
    String name;
    String gfName;
    Child()
    {
        name="Kirmada Bisht";
        gfName="Tanuja Panwar";
    }
    @Override
    void Building()
    {
        System.out.println("Updated building by child");
    }
    void goOnDate()
    {
        System.out.println("Going on Date with "+gfName);
    }
}
public class RunTimePolyMorphism 
{
    public static void main(String[] args) 
    {
        // Parent p=new Parent();
        // System.out.println(p.creditCardNo);
        // System.out.println(p.cvv);
        // System.out.println(p.name);
        // p.Building();
        // p.changeCreditCardDetails();

        // Child c=new Child();
        // System.out.println(c.creditCardNo);
        // System.out.println(c.cvv);
        // System.out.println(c.name);
        // System.out.println(c.gfName);

        // c.Building();
        // c.changeCreditCardDetails();
        // c.goOnDate();


        Parent pObj=new Child();
        System.out.println(pObj.creditCardNo);
        System.out.println(pObj.cvv);
        System.out.println(pObj.name);

        // System.out.println(pObj.gfName);//error
        pObj.Building();
        pObj.changeCreditCardDetails();
        // pObj.goOnDate();//error
    }
}
