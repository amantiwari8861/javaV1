interface Parent1
{
    int num=100;
    void show1();
}
interface Parent2 
{
    int num2=100;
    void show2();
}

interface Parent3 
{
    int num3=100;
    void show3();
}

interface Parent4 
{
    int num4=100;
    void show4();
}
class Abstract2{
    void hi()
    {
        System.out.println("hii");
    }
}
// abstract class Child extends Abstract2 implements Parent1,Parent2,Parent3,Parent4
class Child extends Abstract2 implements Parent1,Parent2,Parent3,Parent4
{
    int num=100;
    public void show(){
        System.out.println("in class");
    }
}

public class multiple{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}