class Women
{
    void doSomething()
    {
        System.out.println("Eat...");
        System.out.println("Sleep...");
    }
    void doSomething(float money,int time)
    {
        System.out.println("Shopping in market");
    }
    void doSomething(float salary,float time,String vehicle)
    {
        System.out.println("Going to Mall...");
    }
    void doSomething(double salary,float time,String vehicle)
    {
        System.out.println("Going to laddakh...");
    }
    void doSomething(String vegetable,String utensil)
    {
        System.out.println("Cooking..");
    }
    // void doSomething(String product,String task) //error
    // {
    //     System.out.println("doing....");
    // }
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
        // w.doSomething("Paneer","bowl");
        // w.doSomething(1000, 2);
        // w.doSomething(10000, "teaching");
        // w.doSomething(10000, 7, "Alto 800");
        // w.doSomething(500, 12, "scooty");
        // w.doSomething(50000.0d, 120, "bullet");
        // w.doSomething(50000.0, 120, "bullet");
        // w.doSomething(50000.0f, 120, "bullet");
        // w.doSomething(1, 200);
        // w.doSomething(3, 3000);
        // w.doSomething(3, 3000l);
        // w.doSomething(3, 3000L);
        // w.doSomething(3, (long)3000);
    }
}