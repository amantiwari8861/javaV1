public class NonStaticContext 
{
    static int num;
    int num2;
    void show()
    {
        System.out.println("Show 1");
    }
    static void show2(){
        System.out.println("Show2");
    }
    public static void main(String[] args) 
    {
        num=100;
        // num2=600; //error can't access non static context
        int num3=80;//local variable
        NonStaticContext sv=new NonStaticContext();
        sv.num2=70;
        NonStaticContext.show2();
        show2();
        // show(); //error can't access non static context
        sv.show();
    }
}