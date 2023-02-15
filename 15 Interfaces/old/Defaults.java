interface Abc {
    int num=50;
    default void DefaultFxn()
    {
        System.out.println("hello i am default fxn in interface ");
    }
}
class Main implements Abc
{
    public static void main(String[] args) {
        Main obj=new Main();
        obj.DefaultFxn();
    }
}