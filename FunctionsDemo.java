class Emp
{
    int id;
    //no argument no return type
   void type1()
   {
       System.out.println("Type 1");
    }
    //no argument with return type
    int type2()
    {
        System.out.println("Type 2");
        return 50;
    }
    //with argument no return type
    void type3(int id2)
    {
        System.out.println("Type 3");
        id = id2;
    }
    //with argument and return type
    String type4(int id2)
    {
        System.out.println("Type 4");
        id = id2;
        return "the employee id is " + id;
    }
    void show()
    {
        System.out.println("ID: " + id+" in show");
    }
}
public class FunctionsDemo 
{
    void fxn()
    {
        System.out.println("hello i am original fxn");
    }
   public static void main(String[] args) {
    Emp e1 = new Emp();
    e1.type1();
    int empid=e1.type2();
    System.out.println("Employee ID: " + empid);
    e1.type3(10);
    e1.show();
    String msg=e1.type4(20);
    System.out.println(msg);
    e1.show();
    // fxn(); error
   } 
}