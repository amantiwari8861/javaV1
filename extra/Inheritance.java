class Mammal
{
    String bloodType;
    String reproduceMethod;

    Mammal()
    {
        bloodType="Warm";
        reproduceMethod="Birth";
    }
    void showMammalsProperty()
    {
        System.out.println(" Blood Type :"+bloodType);
        System.out.println(" Reproduce Method :"+reproduceMethod);
    }
}
class  Human extends Mammal
{
    int walksOnLegs=2;
    int hands=2;
    void showHumanWalkingmethod()
    {
        System.out.println("Humans walks on "+walksOnLegs+" legs");
        System.out.println("Humans has "+hands+" hands");
    }
    // void showNoOfHumanHands()
    // {
    // }
}
public class Inheritance {
    public static void main(String[] args) {
     
        Human prince=new Human();

        // prince.showMammalsProperty();
        // System.out.println(prince.bloodType);
        // System.out.println(prince.reproduceMethod);
        prince.showHumanWalkingmethod();
        // prince.showNoOfHumanHands();


    }
}
