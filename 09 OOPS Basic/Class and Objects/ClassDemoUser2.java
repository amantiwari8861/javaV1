class Car
{
    int wheels=4;
    String modelno="buggati veron";
    double speed=300.5;
    String ownerName;//instance variable
    String regNo;

    void setData(String owner,String reg)
    {
        ownerName=owner;//here owner is local variable
        regNo=reg;
    }
    void showData()
    {
        System.out.println("====== Car details ========");
        System.out.println("Owner name :"+ownerName);
        System.out.println("Registration no: "+regNo);
        System.out.println("wheels :"+wheels);
        System.out.println("modelno  :"+modelno);
        System.out.println("speed :"+speed);
    }
}
public class ClassDemoUser2
{
    public static void main(String[] args) 
    {
        Car car1=new Car();
        // car1.showData();

        car1.setData("Krishna", "UP14D1111");
        car1.showData();
        
    }
}