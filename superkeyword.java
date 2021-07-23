class A
{
    int num=100; //hidden
    void Afxn()  //hidden
    {
        System.out.println("Afxn in Parent ");
    }
}
class B extends A
{
    int num=200;
    void Display()
    {
        System.out.println("the value of num in child is "+num);
        System.out.println("the value of num in parent is "+super.num);
    }
}
public class superkeyword {
public static void main(String[] args) {

    B obj=new B();
    obj.Display();
}
    
}
//variable method constructor