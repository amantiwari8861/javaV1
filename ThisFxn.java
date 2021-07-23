class Demo
{
    Demo(){
        int a=10,b=20;
        int c=a+b;
        this.ShowDetails(c);
    }
    void ShowDetails(int a)
    {
        System.out.println("i am a normal fxn"+a);
    }
}
public class ThisFxn {

    public static void main(String[] args) {
        Demo ob=new Demo();
    }
}