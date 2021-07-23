class ConstOver
{
    int i; //instance variable
    ConstOver()
    {
       System.out.println("default constructor "); 
    }
    ConstOver(int i)
    {
        System.out.println("i = "+i);
    }
    void fxn()
    {
        System.out.println("hii");
    }
}

public class revision5 {
public static void main(String[] args) {
   
    ConstOver objConstOver2=new ConstOver();
    ConstOver objConstOver3=new ConstOver(100);
    
    // ConstOver objConstOver; //reference variable 
    // objConstOver=new ConstOver(); //default
    // new ConstOver(10);
    // ConstOver(); error
    // objConstOver.fxn();
    // new ConstOver().fxn();
}
    
}