
// int a=50; //no global
class Building
{
    int variable=50; //global for the class building 
    // System.out.print("hello");
    void function()
    {
        int c=variable+2;
        System.out.println("hello i am a normal fxn "+c);
    }
       void function1(int a,String name2)
    {
        int c=variable+a;
        System.out.println("hello"+name2+" i  fxn "+c);
    }
}

public class Build {
public static void main(String[] args) {
    Building building1=new Building();
    int a=50;
    String name="Aman";
    building1.function();
    building1.function1(a,name);
    System.out.println("the variable name is "+building1.variable);
}
    
}