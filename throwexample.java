public class throwexample {
    void check(int a,int b)
    {
       /* if (b!=0) 
        {
            System.out.println("the divide is "+(a/b));
        } 
        else {
            System.out.println("divide by zero");
            throw new RuntimeException("divided by zero condition !");
        }*/
        try {
            System.out.println("the divide is "+(a/b));

        } catch (ArithmeticException e) {
            System.out.println("divide by zero");
            throw e;
            // System.out.println("it will not execute");
        }
    }
    public static void main(String[] args) {
        int a=10,b=0;
        throwexample obj=new throwexample();
        try{
            obj.check(a,b);
        }
        catch(Exception e)
        {
            System.out.println("handled  by main succesfully");
        }
    }
}

/*
The throw keyword is used to explicitly throw a single exception.
When an exception is thrown, the flow of program execution transfers from the try block
 to the catch block. We use the throw keyword within a method
throw is used to  throw an exception for a method
*/