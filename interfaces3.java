interface p1
{
    int i=100;
    void fxn();
    // void fxn2()
    // {
    //     System.out.println("hii ");
    // }
    default void fxn3()
    {
        System.out.println("i am default fxn ");
    }
    static void fxn4()
    {
        System.out.println("static method ");
    }
}

class Main implements p1
{
    public void fxn() {
        System.out.println("hello i am a fxn ");
    }
    public static void main(String[] args) {
    
        p1 obj=new Main();
        obj.fxn();
        obj.fxn3();
        // fxn3(); error 
        p1.fxn4();
    }
}