public class Method {
public static void main(String[] args) {
    System.out.println("hello i am original main fxn ");
}
  public static void main(String args) {
    System.out.println("hello i am a string argument passed fxn "+args);   
  }  
  public static void main(int args) {
    System.out.println("hello i am a string argument passed fxn "+args);   
  }  
}
class Run
{
    // void main(String args) {
    //     System.out.println("hello i am original main fxn in run class "+args);
    // }
    public static void main(String[] args) {
        Method obj2=new Method();
        obj2.main("aman");
        obj2.main(50);
        // Run obj=new Run();
        // obj.main("args");
    }
}