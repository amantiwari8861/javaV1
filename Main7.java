class Parent7
{
    Parent7()
    {
        System.out.println("Default Called");
    }
    int num=200;
    void pfxn()
    {
        System.out.println(" num = "+num);
    }
}
class Child extends Parent7
{
    int num2=300;
    void cfxn()
    {
        System.out.println(" num ="+num+" num2= "+num2);
    }
}
public class Main7 {
    public static void main(String[] args) {
        Child objChild=new Child();
        objChild.cfxn();
        objChild.pfxn();
    }
}