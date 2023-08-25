class Driver
{
    public void Driving() {
        Car obj=new Car(); //uses-a 
        obj.accelerate();  
    }
    public static void main(String[] args) {
        Driver objDriver=new Driver();
        objDriver.Driving();
    }
}