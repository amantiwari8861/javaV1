interface Greeting 
{
    default void hello() {
        System.out.println(" hello from A");
    }
}
interface GreetingExtn extends Greeting 
{
    @Override
    default void hello() {
        System.out.println(" hello from B");
    }
}
public class InheritanceProblem implements GreetingExtn, Greeting 
{
    public static void main(String[] args) 
    {
        InheritanceProblem ip = new InheritanceProblem();
        ip.hello();
    }
}