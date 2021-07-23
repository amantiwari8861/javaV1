interface one
{
    default void hello()
    {
        System.out.println("i am hello fxn");
    }
    static void statMethod()
    {
        System.out.println("hello i am static method");
    }
}
class Main implements one
{
    public static void main(String[] args) {
        Main obj=new Main();
        obj.hello();
        one.statMethod();
    }
}