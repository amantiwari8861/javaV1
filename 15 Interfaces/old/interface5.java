interface Parent1
{
    int num3=60;
}
interface ch1 extends Parent1
{
    int num5=79;
}
interface ch2 extends Parent1
{
    int num8=790;
}
interface ch12 extends ch1
{
    int num11=780;
}
interface ch13 extends ch1
{
    int num13=770;
}
class Child7 implements ch12,ch13,ch2
{
    void show()
    {
        System.out.println(" num3 "+num3+" "+" num5 "+num5+" "+" num8 "+num8+" "+" num11 "+num11+" "+" num13 "+num13);
    }
    public static void main(String[] args) {
        Child7 obj=new Child7();
        obj.show();
    }
}
