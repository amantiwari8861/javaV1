// interface Parent1
// {
//     int num1=10;
//     void Parentfxn1();
// }
// interface Parent2 extends Parent1
// {
//     int num2=10;
//     void Parentfxn2();
// }
// interface Parent3 extends Parent2
// {
//     int num3=10;
//     void Parentfxn3();
// }
interface Parent1
{
    int num1=10;
    void Parentfxn1();
}
interface Parent2
{
    int num2=10;
    void Parentfxn2();
}
interface Parent3
{
    int num3=10;
    void Parentfxn3();
}

class abc
{
    void hellofxn()
    {
        System.out.println("hello i am normal class ");
    }
}
// class child extends abc implements Parent3
// class child implements Parent1,Parent2,Parent3
class child extends abc implements Parent1,Parent2,Parent3
{
    void showDetails()
    {
        System.out.println("the value of num1 = "+num1+" num2 ="+num2+" num3 = "+num3);
    }
    public void Parentfxn1()
    {
        System.out.println("i am Parent1 fxn ");
    }
    public void Parentfxn2()
    {
        System.out.println("i am Parent1 fxn ");
    }
    public void Parentfxn3()
    {
        System.out.println("i am Parent1 fxn ");
    }
}

class Main
{
    public static void main(String[] args) {
        child obj=new child();
        obj.Parentfxn1();
        obj.Parentfxn2();
        obj.Parentfxn3();
        obj.showDetails();
        obj.hellofxn(); 
    }
}