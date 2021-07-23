class a1
{
    // int a=20;
    int a;
}
class a2
{
    // int b=30;
    int b;
}
class main3
{
    public static void main(String args[])
    {
        System.out.println("in main fxn ");
        a1 obj1=new a1();
        a1 obj3=new a1();
        a2 obj2=new a2();
        obj1.a=30;
        obj3.a=50;
        obj2.b=60;
        int c=obj1.a+obj3.a + obj2.b;
        System.out.println("the value of c is "+c);
    }
}