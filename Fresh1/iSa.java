class Parent
{
    int Pnum;
    public void Pfxn() {
        System.out.println("hello i am parent fxn ");
    }
}
class Child extends Parent
{
    int Cnum;
    public void Cfxn() {
        System.out.println("hello i am child fxn ");
    }
}
public class iSa {
public static void main(String[] args) {
    
    Child obj=new Child();
    obj.Cfxn();
    obj.Pfxn();
}
    
}