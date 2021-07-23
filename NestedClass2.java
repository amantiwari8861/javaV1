class NestedClass2
{
    void Outerfxn()
    {
        System.out.println("hiii outer fxn");
    }

     class InnerNestedClass2 {
    
        void innerFxn()
        {
            System.out.println("hii inner fxn");
        }
    }
}
class Main 
{
    public static void main(String[] args) {
        NestedClass2 obj=new NestedClass2();
        obj.Outerfxn();
        // obj.innerFxn(); //error 
        NestedClass2.InnerNestedClass2 obj2=obj.new InnerNestedClass2();// to make innerclass object
        obj2.innerFxn();

    }
}