class OuterClass2
{
    void MethodLocal()
    {
        System.out.println("before class");
        class Methodlocal2
        {
            int j=500;
            void show()
            {
                System.out.println("hello i am local class in a method "+j);
            }
        }
        System.out.println("after class");
        Methodlocal2 obj=new Methodlocal2();
        obj.show();
    }
    // void method2()
    // {
    //     Methodlocal2 obj=new Methodlocal2();
    //     obj.show();
    // }
}

class Main 
{
    public static void main(String[] args) {
        OuterClass2 obj=new OuterClass2();
        obj.MethodLocal();
    }
}