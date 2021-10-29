class OuterClass
{
    private int i=50;
    void show(){System.out.println("hii i am outer class method");}

    class InnerClass
    {
        private int i2=200;
        void innerShow()
        {
            System.out.println("hello i am inner fxn ");
            System.out.println("i= "+i+" i2 = "+i2);
            show();
        }
    }
}
class Main 
{
    static void show2()
    {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        
        OuterClass objOuterClass=new OuterClass();
        objOuterClass.show();
        // objOuterClass.innerShow();// error (bcz it is outer class object )
        OuterClass.InnerClass Innerobj=objOuterClass.new InnerClass();
        Innerobj.innerShow();
        // Innerobj.show(); //error
        Main.show2();
        show2();
    }
}