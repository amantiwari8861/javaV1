final class A
{
    int num=100;
}
class B extends A
{
    int num2=100;
}
class FinalClass {

    public static void main(String[] args) {
        B obj=new B();
        System.out.println("the value of child num2 is "+obj.num2);
        System.out.println("the value of Parent num is "+obj.num);
    }  
}