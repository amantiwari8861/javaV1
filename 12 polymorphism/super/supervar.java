class GrandParent
{
    int num1=50;
    void grandParentFxn()
    {
        System.out.println("hello i am grand parent class fxn "+num1);
    }
}
class Parent extends GrandParent
{
    int num=10;
    void parentFxn()
    {
        System.out.println("hello i am parent class fxn "+num);
    }
}
class child extends Parent
{
    // int var=50;
    void childFxn()
    {
        // int var3=super.num;
        int var3=super.num1;
        System.out.println("hello i am child fxn "+var3);
    }
}
public class supervar {
public static void main(String[] args) {
    child obj=new child();
    obj.childFxn();
}   
}