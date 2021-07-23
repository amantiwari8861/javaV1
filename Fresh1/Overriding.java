class Parent
{
    int Pnum;
    public void Cfxn() {
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
public class Overriding {
public static void main(String[] args) {
    
    // Child obj=new Child();
    // obj.Cfxn(); //ambiguity
    Parent obj=new Child();
    obj.Cfxn();
    // Parent obj2=new Parent();
    // obj2.Cfxn();
    // Child obj3=new Parent();  //cannot convert parent to child
    // obj3.Cfxn();
}
}