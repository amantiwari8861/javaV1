//multi-level
interface Parent1{
    int number1=100;
}
interface Parent2 extends Parent1
{
    int number2=150;
}
interface Parent3 extends Parent2
{
    int number3=250;
}
class Child4 implements Parent3{

    void childfxn()
    {
        System.out.println("number1 = "+number1+" number2 ="+number2+" number3 ="+number3);
    }
    public static void main(String[] args) {
        Child4 obj4=new Child4();
        obj4.childfxn();
    }
}