class GrandParent
{
    int num=100;
    void show()
    {
        System.out.println("GrandParent Fxn");
    }
    void grandParentFxn()
    {
        System.out.println("Grand parent fxn");
    }
}
class Parent extends GrandParent
{
    int a;
    int num=100;
    Parent()
    {
        System.out.println("parent default const.");
    }
    Parent(int a)
    {
        this.a=a;
        System.out.println("parent default const.");
    }
    void show()
    {
        System.out.println("Show method in Parent "+a);
    }
}
class Child extends Parent
{
    Child()
    {
        System.out.println("jii");
    }

    void show()
    {
        System.out.println("show method in child");
    }
    int num=200;
    void childFxn()
    {
        super.show();
        super.grandParentFxn();
        System.out.println("Child Fxn "+num+" parent num :"+super.num);
    }
}

public class Super {
    public static void main(String[] args) {
        
        Child objChild=new Child();
        // objChild.show();
        objChild.childFxn();
        objChild.grandParentFxn();
        //child  can only call it's immidiate parent's  overridden method

    }
}
