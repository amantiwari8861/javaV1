interface Babban {

    int id=101;
    void show();
    default void fxn()
    {
        System.out.println("hii i am default method");
    } 
    static void fxn2()
    {
        System.out.println("hii i am static method");
    }

}
class Employer implements Babban
{
    public void show()
    {
        System.out.println("Hiii"+id);
    }
}


public class Interfaces {

  public static void main(String[] args) {
      Employer obj=new Employer();
      obj.show();
      System.out.println(Babban.id);
      Babban.fxn2();
  }  
}