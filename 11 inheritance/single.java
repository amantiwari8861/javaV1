class Parent
{
    int num=10;
    void parentFxn()
    {
        System.out.println("hello i am parent class fxn "+num);
    }
}
class child extends Parent
{
    int var=50;
    void childFxn()
    {
        System.out.println("hello i am child fxn "+var);
    }
}
public class single {
public static void main(String[] args) {
    child obj=new child();   
    obj.parentFxn();
    obj.childFxn();
}   
}