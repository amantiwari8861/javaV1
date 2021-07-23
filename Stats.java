class Stats
{
    static int var=50;
    static String name="Aman";
    int a=10,b=60; 
}
class run{
   public static void main(String args[])
   {
       Stats obj=new Stats();
       System.out.println("my name is "+Stats.name);
    //    System.out.println("value of a is "+Stats.a); error
       System.out.println("value of a is "+obj.a);
        Stats.name="rohit";
       System.out.println("my name is "+Stats.name);
   }
}