class CarFactory
{
    Car obj=new Car();//has-a
    void makeCar()
    {
        System.out.println("i am making a car ");
        obj.accelerate();
    }

    public static void main(String[] args) {
        CarFactory objCarFactory=new CarFactory();
        objCarFactory.makeCar();
    }
}