class overloading
{
    // void fxn()  //no parameter fxn
    // {
    //     System.out.println("hii i am no argument/parameter fxn ");
    // }
    // void fxn(int a)
    // {
    //     System.out.println("hii i am with argument fxn "+a);
    // }
    // void fxn(char ch)
    // {
    //     System.out.println("char type argument "+ch);
    // }
    // void fxn(int a,char ch)
    // {
    //     System.out.println(" int and char argument "+a+"  "+ch);
    // }
    // void fxn(char ch,int a)
    // {
    //     System.out.println("char and int arg.  "+ch+"  "+a);
    // }
    // void fxn(int a,double d)
    // {
    //     System.out.println("the value of a = "+a+"   d = "+d);
    // }
    // void fxn(double d ,int a)
    // {
    //     System.out.println("the value of d = "+d+" a = "+a);
    // }
    void fxn(double d,int a)
    {
        System.out.println("double  value is d ="+d+" a= "+a); //int promoted into double
    }
}
public class revision4 {
public static void main(String[] args) {
    overloading obj=new overloading();
    // obj.fxn();
    // obj.fxn(100);    
    // obj.fxn('A');
    // obj.fxn(100,'A');
    // obj.fxn('B',200);
    // obj.fxn(10,20); //ambiguity 
    // obj.fxn(10d,20);
    // obj.fxn(10,20);//10 is integer value 
    // obj.fxn(10,20d);//error can't convert from double to int
}
    
}