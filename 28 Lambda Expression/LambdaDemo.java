interface DemoInterface1 { //To implement the lambda expression with no arguments
    void noArguments();
    // void testFxn();
}

interface DemoInterface2 { //To implement the lambda expression with two arguments
    void twoArguments(String s1, Integer i1);
}

interface DemoInterface3 { //To implement the lambda expression with one argument
    Integer singleArgument(Integer i1);
}

public class LambdaDemo
{
    public static void main (String[] args) 
    {
        // DemoInterface1 di1=new DemoInterface1(){
        //     @Override
        //     public void noArguments() {
        //         System.out.println("this is an object of demointerface 1");
        //     }
        // };
        // di1.noArguments();

    //     //Example 1: To access a method with no arguments
        // System.out.println("Example 1: No argument lambda expression ");
        // DemoInterface1 demoInterface1 = () -> {System.out.println("No arguments");};
        // demoInterface1.noArguments();

        // System.out.println(); //for line spacing
        
    //   //Example 2: To access a method with 2 arguments
        // System.out.println("Example 2: Multiple arguments lambda expression ");
        // DemoInterface2 demoInterface2 = (String s, Integer i) -> System.out.println("String value: "+s+", Integer value: "+i);
        // demoInterface2.twoArguments("Christiano Ronaldo", 7);
        // System.out.println(); //for line spacing
        
       //Example 3: To access a method with 1 argument
    //     System.out.println("Example 3: One argument lambda expression to print square of the given Integer number");
        // DemoInterface3 demoInterface3 = (k) -> k*k;// it is returning the result from method
        // DemoInterface3 demoInterface3 = (k) ->{ return k*k; };
        // DemoInterface3 demoInterface3 = k -> k*k;
        // System.out.println(demoInterface3.singleArgument(7));
        // System.out.println(); //for line spacing
        
    }
}