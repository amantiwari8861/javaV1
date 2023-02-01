public class Overloading {
    Overloading(){}
    Overloading(int a,int b)
    {
        System.out.println("this is 1st fxn "+a+" "+b);
    }
    Overloading(long a,long b)
    {
        System.out.println("this is 2nd fxn "+a+" "+b);
    }

    void fxn1(int a,char b){
        System.out.println(a+" "+b);
    }
    void fxn1(long a,char b){
        System.out.println("hello "+a+" "+b);
    }
}
class Main 
{
    public static void main(String[] args) {
        Overloading obj=new Overloading(50l, 60l);
        obj.fxn1(10L, 'A');
        long l=Long.parseLong(args[0]);
 
    }
}