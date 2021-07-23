class Bike
{
    String name;
    Bike(){
        System.out.println("hello i am default constructor of parent");
    }
    Bike(String name)
    {
        this.name=name;
        System.out.println("the name is :"+name);
    }
}
class Hero extends Bike
{
    Hero()
    {
        // super();
        super("abc");
        System.out.println("hello i am default constructor of child");
    }
}
class Run
{
    public static void main(String[] args) {
        Hero obj=new Hero();        
    }
}