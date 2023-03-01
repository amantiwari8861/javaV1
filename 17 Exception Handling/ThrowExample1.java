/*
The throw keyword is used to explicitly throw a single exception.
When an exception is thrown, the flow of program execution transfers from the try block
 to the catch block. We use the throw keyword within a method
throw is used to  throw an exception for a method
*/
class ThrowExample1
{
    public static void main(String[] args) {
        int age=9;
        if(age<18)
        {
            // System.out.println("age must be greater than 18");
            // throw new IllegalArgumentException("age must be greater than 18");
            throw new RuntimeException("not ready to vote");
            // System.out.println("hii");// unreachable code
            // System.out.println("hii");// unreachable code
        }
        else
        {
            System.out.println("ready to vote !");
        }
        System.out.println("after if code");
        System.out.println("after if code");
        System.out.println("after if code");
        System.out.println("after if code");
        
        // try {
            // throw new ArithmeticException("age must be greater than 18");
        // } catch (Exception e) {
        //     System.out.println("exception handled");
        // }
    }
}