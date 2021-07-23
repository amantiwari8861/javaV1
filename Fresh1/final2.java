// final class Parent //u can't inherit 
class Parent 
{
    int num;
    final void fxn(){System.out.println("anything");}//fxn() in Child cannot override fxn() in Parent
}
class Child extends Parent
{
    void fxn()
    {
        System.out.println("anything in child");
    }
    public static void main(String[] args) {
        
        Child objChild=new Child();
        objChild.fxn();
    }
}