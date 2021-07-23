interface  P1
{
    int num1=10;
}
interface C1 extends P1
{
    int num2=20;
}
interface C2 extends P1
{
    int num3=30;
}
interface D extends C1,C2
{
    int num4=40;
}
class Children implements D
{
    void show()
    {
        System.out.println("num1 ="+num1+"num2 ="+num2+"num3 ="+num3+"num4 ="+num4);
    }
    public static void main(String[] args) {
        Children obj=new Children();
        obj.show();
    }
}