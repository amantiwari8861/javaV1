interface vehicle3
{
    // vehicle3(){System.out.println("hii");} //we can't make constructor
    int i=100; // public static final 
    // int j; we can't use blank final here 
    // protected int j=200; we can't
    // private int j=200; we can't
    // default int j=200; we can't
    void fxn(); // public abstract 
    private void fxn2()//being helper methods for the other methods
    {
        System.out.println("i released in java 9");
    } 
    private static void fxn4()//being helper methods for the other methods
    {
        System.out.println("i released in java 9 version");
    } 
    default void fxn5()
    {
        fxn2();
        fxn4();
        System.out.println("hii");
    }
    static void fxn10()
    {
        System.out.println("hello");
    }
}

public class interfaces4 implements vehicle3
{
    //void fxn(){}  // error public -> default (reduction of visibility)
    public void fxn(){
        System.out.println("overridden method fxn ");
    }
public static void main(String[] args) {
    // interfaces4 obj=new interfaces4();
    vehicle3 obj=new interfaces4(); //overriding
    obj.fxn();
    obj.fxn5();
    // obj.fxn2(); error fxn2 is private
    vehicle3.fxn10();

}
}

// class extends class 
// class implements interfaces 
// interface extends interfaces
// class extends class implements interfaces

