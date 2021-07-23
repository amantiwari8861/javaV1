class Car
{
    Car(){}
    public Car getobject(){
        return this;//represent current class object 
    }
    void Show()
    {
        System.out.println("hello i am show fxn ");
    }
}
public class covarient {
    public static void main(String[] args) {
        new Car().getobject().Show();
        // Car obj;//reference variable created 
        // obj=new Car().getobject();
        // obj.Show();
    }
}