class NestedClass3
{
    void Outerfxn()
    {
        System.out.println("hiii outer fxn");
    }
    static class InnerNestedClass2 {
    
        void innerFxn()
        {
            System.out.println("hii inner fxn");
        }
        static void show()
        {
            System.out.println("hello bro");
        }
    }
}
class Main 
{
    public static void main(String[] args) {
        NestedClass3.InnerNestedClass2 obj2=new NestedClass3.InnerNestedClass2();// to make innerclass object
        obj2.innerFxn();
        // obj2.Outerfxn(); //error 
        NestedClass3.InnerNestedClass2.show();
    }
}