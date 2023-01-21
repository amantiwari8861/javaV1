class Car
{
    int tyres=4;  //instance variable
    void accelerate()
    {
        System.out.println("running car");
    }
}

public class Array4 {
    //jvm calls main method itself
public static void main(String[] args) {
    
Car oCar=new Car();
//reference variable

oCar.accelerate();
oCar.accelerate();
oCar.accelerate();
oCar.accelerate();
System.out.println(" tyres = "+oCar.tyres);

}
    
}
