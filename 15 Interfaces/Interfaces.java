interface Parent1 
{
    int a=10;
  void parent1fxn();
}
class child implements Parent1
{
    void childfxn()
    {
        System.out.println("the value of a is "+a);
    }
   public void parent1fxn()
    {
        System.out.println("hello i am child ");
    }
}
public class Interfaces {
public static void main(String[] args) {
    child obj=new child();
    obj.childfxn();
    obj.parent1fxn();
}   
}
// sc750310@gmail.com