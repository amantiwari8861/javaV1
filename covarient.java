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
        Car obj;//reference variable created 
        // obj.Show();//compile time error
        obj=new Car().getobject();
        obj.Show();
        // new Car().getobject().Show();
    }
}