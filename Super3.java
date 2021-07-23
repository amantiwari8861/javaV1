class ParentClass
{
    int num=10;
    public void fxn() {
        System.out.println("hello i am parent class ");
    }
}
class ChildClass extends ParentClass
{
    int num=100;
    public void fxn() {
        System.out.println("hello i am Child class ");
    }
    void display()
    {
        System.out.println("parent variable :"+super.num);
        super.fxn();
    }
}
public class Super3 {
    public static void main(String[] args) {
        ChildClass objChildClass=new ChildClass();
        System.out.println("the number is "+objChildClass.num);
        objChildClass.fxn();
        objChildClass.display();
    }
}
