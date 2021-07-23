class Abc
{
    Abc()
    {
        System.out.println("default constructor");
    }
    int hello()
    {
        System.out.print("normal function in abc class ");
        return 10;
    }
}
class New21
{
    public static void main(String args[])
    {
        Abc obj=new Abc();
       System.out.println( obj.hello() );
        /*int arr[]={10,20,30,40,50};
        for(int a:arr)
        {
            System.out.print(a+" \t");
        }*/
    }
}