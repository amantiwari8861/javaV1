interface Parent1
{
   public static final int num1=100;
   public abstract void pfxn();
   default void abc(){
       System.out.println("hello i am default fxn ");
   } 
    //single inheritance using interfaces
}
class Demo implements Parent1
{
    public void pfxn()
    {
        System.out.println("hello i am p fxn");
    }
    public static void main(String[] args) {
        Demo obj=new Demo();
        System.out.println("the value of num1 is "+num1);
        obj.pfxn();
        obj.abc();
    }
}