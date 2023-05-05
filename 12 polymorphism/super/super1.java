class Parent
{
    int num=10;
    void parentFxn()
    {
        System.out.println(" class fxn "+num);
    }
}
class child extends Parent
{
    int num=50;
    void childFxn()
    {
        // int var3=super.num1;
        System.out.println("hello i am child fxn "+num);
        System.out.println("hello i am calling parent fxn "+super.num);
    }
}
public class super1 {
public static void main(String[] args) {
    child obj=new child();
    obj.childFxn();
}   
}