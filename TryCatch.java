import java.lang.Exception;
public class TryCatch {
    public static void main(String[] args) {
        System.out.println("before try catch");
        try {

            // System.out.println(1/0);
            System.out.println("after arithematic code");
            // String str=null;
            // System.out.println(str.length());
            System.out.println("after Null string code");
            int arr[]={10,20};
            System.out.println(arr[2]); //not in array
        }
        catch(ArithmeticException a)
        {
            System.out.println("this is capable to handle arithmetic exception");
        }
        catch(NullPointerException a)
        {
            System.out.println("this is capable to handle NULL pointer exception");
        }
        catch(Exception e)
        {
            System.out.println("this is capable to handle all exceptions");
        }
        finally
        {
            System.out.println("this will run chahe error aaye ya na");
        }
            System.out.println("after try catch finally");
    }
}