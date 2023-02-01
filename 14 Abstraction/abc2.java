abstract class abc2
{
    void a()
    {
        System.out.println("hii");
    }
    abstract void show();
}
class Main 
{
    public static void main(String[] args) {
        abc2 obj=new abc2()
        {
            void show()
            {
                System.out.println("hello");
            }
        };
        obj.a();
        obj.show();
    }
}