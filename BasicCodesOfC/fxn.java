class Demo2
{
    Demo2()
    {
        System.out.println("hello i am a constructor ");
    }
    void fxn()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println("hello world \n"+c);
    }
    public static void main(String args[])
    {
        Demo2 obj5=new Demo2();
        obj5.fxn();
    }
}