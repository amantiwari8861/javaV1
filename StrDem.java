public class StrDem {
public static void main(String[] args) {
    
    //1st method 
    //String name="Aman"; //this is string literal
    //String name2=" Tiwari"; //this is string literal
    // name=name.concat("hello"); //re-initialization of String variable name 
    //name=name.concat(name2); //re-initialization of String variable name 
    //System.out.println("the value of name is "+name); 
    //2nd method 
    String dem1=new String("Abc"); //java heap (bad programming practice  )
    String dem2=new String("Abc"); //java heap (bad programming practice  )
    String namez1="aman";
    String namez2="aman";
    String namez3="tiwari";
    System.out.println(namez1==namez2);
    System.out.println(namez1==namez3);
    // which is more efficent for storing duplicate string values 
}   
}