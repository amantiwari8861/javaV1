class abc
{
    int a=20,b=30,c;//instance variable
   // c=a+b;
    void abc2()
    {
        int d;//local var.
        System.out.print("hello ");
    }
    public static void main(String args[])
    {
        int e;/** local var*/
        abc obj=new abc();
        obj.abc2();
    }

}