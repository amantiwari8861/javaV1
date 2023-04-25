class Building
{
    //constructor is a special type of method that is called when an object is created
    // it is used to initialize the initial values of the object
    int num;//instance variable
    Building() //compiler automatically adds this
    {
        System.out.println("Default Constructor called :"+num);
    }
    // Building(){}
    // Building(int num2)
    // {
    //     num=num2;
    //     System.out.println("Parameterized Constructor called :"+num);
    // }
    void showData()
    {
        System.out.println("The value of num is "+num);
    }
}
public class constructor {
public static void main(String[] args) {
    // Building obj=new Building();//constructor

    //for making object of class there must me be atleast one constructor
    // obj.showData();
    // Building obj1=new Building(10);//constructor

    new Building(); // instance (object or real world entity )

    // Building devKiBuilding; //reference variable
    // devKiBuilding=new Building();

    Building devKiBuilding=new Building();
    Scanner sc=new Scanner(System.in);
}
}