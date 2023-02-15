interface Parent1
{
    int num1=50;
}
interface Parent2
{
    int num2=150;
}
interface Parent3
{
    int num3=100;
}
class Child3 implements Parent1,Parent2,Parent3
{
    void showDetails()
    {//multiple inheritance
        System.out.println("the value of "+num1+" "+num2+" "+num3);
    }
    public static void main(String[] args) {
        Child3 obj2=new Child3();
        obj2.showDetails();
    }
}