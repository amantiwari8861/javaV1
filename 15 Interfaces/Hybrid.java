interface Cat 
{
    boolean IS_TAIL_AVAILABLE=true;
    int LEGS=4;
    void foodType();
}
interface Lion extends Cat
{
    double MAX_HEIGHT=2.2;
    double MAX_WEIGHT=270;
    void habitat();    
}
interface Tiger 
{
    double MAX_HEIGHT=1.5;
    void mindSharpness();
}
class Liger implements Lion,Tiger
{

    @Override
    public void foodType() 
    {
        System.out.println("omnivores");
    }
    @Override
    public void habitat() {
        System.out.println("jungle");
    }
    @Override
    public void mindSharpness() {
        System.out.println("not sharp as tiger");
    }
    void showDetails()
    {
        System.out.println("********** Liger Details ***********");
        System.out.println("Legs : "+LEGS);
        System.out.println("IS tail available ? "+IS_TAIL_AVAILABLE);
        System.out.println("Max weight :"+MAX_WEIGHT);
        // System.out.println("MAX height :"+MAX_HEIGHT);
        System.out.println("Lion MAX height :"+Lion.MAX_HEIGHT);
        System.out.println("Tiger MAX height :"+Tiger.MAX_HEIGHT);
        System.out.println("Liger MAX height :"+((Lion.MAX_HEIGHT+Tiger.MAX_HEIGHT)/2.0));
    }

}
public class Hybrid {

    public static void main(String[] args) {
        
        Liger l=new Liger();
        l.foodType();
        l.habitat();
        l.mindSharpness();
        l.showDetails();
    }
}