class Mammal
{
    final void eatingOrgan()
    {
        System.out.println("Mouth");
    }
}
class Dog extends Mammal
{
    void eatingOrgan()//eatingOrgan() in Dog cannot override eatingOrgan() in Mammal
    {

    }
}


public class FinalMethod 
{
    public static void main(String[] args) {
        
    }
}