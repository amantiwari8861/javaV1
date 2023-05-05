class GrandParent
{
    int num=100;
    void show()
    {
        System.out.println("GrandParent Fxn");
    }
}
class Parent
{
    int a;
    Parent()
    {
        System.out.println("parent default const.");
    }
    Parent(int a)
    {
        this.a=a;
        System.out.println("parent default const.");
    }
    int num=100;
    void show()
    {
        System.out.println("Parent Fxn"+a);
    }
}
class Child extends Parent
{
    Child()
    {
        System.out.println("jii");
        super(55);
    }


    int num=200;
    void childFxn()
    {
        super.show();
        System.out.println("Child Fxn "+num+" parent num :"+super.num);
    }
}

public class Super {
    public static void main(String[] args) {
        
        Child objChild=new Child();
        objChild.childFxn();
    }
}
