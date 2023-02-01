abstract class polygon  //abstract keyword
{
   /* polygon()
    {
        System.out.println("constructor of abstract class ");
    }
    int i=10;// non-static vaiable
    static int b=50; //static variable 
   static void side()  // non-abstract static  method
    */
     void side()  // non-abstract method  or concrete method
    {
        System.out.println("the default side is 4 ");
    }
    abstract void listsides(); //abstract method
    final void names()
    {
        System.out.println("i cannot be changed by child");
    }
}
class rectangle extends polygon
{
    void rectanglefxn()
    {
        System.out.println("hii iam rectangle class fxn ");
    }
    void listsides()
    {
        System.out.println("this child class must implement the parent class abstract function ");
    }
    // void names()
    // {
    //     System.out.println("hllo");  // cannot override final methods
    // }
}
public class abstr {
public static void main(String[] args) {
    polygon obj=new rectangle();
    obj.side();
    obj.listsides();
    // polygon p=new polygon(); //we cannot instantiate abstract  class
    // obj.rectanglefxn(); //error bcz the refernce variable of type polygon
}
}

/*if we implemented a abstract class then we must have to give that class
abstract methods defination in the child class */