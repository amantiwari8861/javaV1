class Animal{
    int age=4;
    String name="dog";
    public static void showName() {
        System.out.println("i am animal");
    }
    public static Animal getAnimal() //static method
    {
        return new Animal();//returns current class object
    }
    public Animal getMyDog()//non static
    {
        return new Animal();
        // return this;
    }
    void show()
    {
        System.out.println("i am animal show fxn");
    }
}
public class CovarStat {
    public static void main(String[] args) {    
        // Animal obj=new Animal();
        // obj.showName();
        // Animal.showName();
        Animal obj;//reference variable created
        // System.out.println(obj.age);//compile time error
        // System.out.println(obj.name);//compile time error
        obj=Animal.getAnimal();//it will get Animal class object
        System.out.println(obj.age);
        System.out.println(obj.name);
        // obj.showName();

        // new Animal().getAnimal().showName();
        new Animal().getMyDog().show();
    }
}