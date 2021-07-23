class con1
{
    int var;
    con1()
    {
        System.out.println("default constructor");
    }
    con1(int a)
    {
        System.out.println("parameterized constructor");
        var=a;
    }//   con1(int a)
    // {
    //     System.out.println("parameterized constructor");
    //     var=a;
    // }
    void xyz()
    {
      System.out.println("the value of var is "+var);  
    }
}
class run
{
    public static void main(String args[])
    {
        con1 obj=new con1();
        con1 obj1=new con1(50);
        obj1.xyz();
    }
}