class Women
{
    //to acheive method overloading the method name must be same and the no. of parameters(arguments) or the data type of argument must be different
    void doSomething()
    {
        System.out.println("Eat...");
        System.out.println("Sleep...");
    }
    void doSomething(float money,int time)
    {
        System.out.println("Shopping in market");
    }
    // void doSomething(String vegetable,String utensil) //error
    // {
    //     System.out.println("Cooking..");
    // }
    // void doSomething(String utensil,String vegetable) //error
    // {
    //     System.out.println("Cooking gajar ka hlwa");
    // }
    void doSomething(float salary,float time,String vehicle)
    {
        System.out.println("Going to Mall to spend "+salary+" in "+time+" hr by "+vehicle);
    }
    void doSomething(double salary,float time,String vehicle) 
    {
        System.out.println("Going to laddakh to spend "+salary+" in "+time+" hour by "+vehicle);
    }
    void doSomething(int time,int steps)
    {
        System.out.println("walking on roof");
    }
    void doSomething(int time,long steps)
    {
        System.out.println("jogging in park");
    }

}
public class MethodOverloading 
{
    public static void main(String[] args) 
    {
       Women w=new Women();
       
        // w.doSomething();
        // w.doSomething(100,10);
        // w.doSomething(10000, 3, "Alto 800");
        // // w.doSomething(50000, 120, "bullet");
        // w.doSomething(50000.0, 120, "bullet");
        // w.doSomething(50000d, 120, "bullet");
        // w.doSomething(1, 200);
        // w.doSomething(3, 3000);
        w.doSomething(3, 3000l);
        w.doSomething(3, 3000L);
        w.doSomething(3, (long)3000);

        System.out.println();
        System.out.println(10);
        System.out.println(10L);

    }
}