class Parent
{
    int num=10;
    void parentFxn()
    {
        System.out.println("hello i am parent class fxn "+num);
    }
}
class child1 extends Parent
{
    int var1=50;
    void child1Fxn()
    {
        System.out.println("hello i am child1 fxn "+var1);
    }
}class child2 extends Parent
{
    int var2=50;
    void child2Fxn()
    {
        System.out.println("hello i am child2 fxn "+var2);
    }
}class child3 extends Parent
{
    int var3=50;
    void child3Fxn()
    {
        System.out.println("hello i am child3 fxn "+var3);
    }
}
public class hierarchical {
public static void main(String[] args) {
    child1 obj1=new child1();   
    child2 obj2=new child2();   
    child3 obj3=new child3();   
    obj1.parentFxn();
    obj1.child1Fxn();
    obj2.parentFxn();
    obj2.child2Fxn();
    obj3.parentFxn();
    obj3.child3Fxn();
    }   
}