class Parent
{
//    final void parentFxn() //cannot override
    final void parentFxn() //cannot override
    {
        System.out.println("parent fxn");
    }
}
/*class Child extends Parent
{
    void parentFxn()
    {
        System.out.println("child fxn ");
    }
}*/
public class Fin3 {

    public static void main(String[] args) {
        // Parent obj=new Child(); 
        Parent obj2=new Parent();
        obj2.parentFxn();     
    }
}