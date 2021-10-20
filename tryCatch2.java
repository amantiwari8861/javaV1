class tryCatch2
{
    public static void main(String[] args) {
        System.out.println("before try");
        try {
            //suspicious code
            // String var=null;
            // String var="hii";
            // System.out.println(var); //null
            System.out.println(1/0); //infinity
            // System.out.println(" the length is :"+var.length()); // null pointer exception
            System.out.println("hello i will never execute if exception occurs above");
        }
        // finally
        // {
        //     System.out.println("i will run always either exception occur or not ");
        // } 
        // catch (NullPointerException e) {
        //     //catch the exception
        //     System.out.println("pls insert a valid value!");
        //     System.out.println("error handling codes!");
        //     // e.printStackTrace();// fully qualified exception details
        //     // System.out.println(e.getMessage());
        // }
        catch(ArithmeticException a)
        {
            System.out.println("divided by zero condition");
        }
        // catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException  obj)
        // {
        //     System.out.println("3 types of exceptions can be handled ");
        // }
        // catch(RuntimeException obj)
        // {
        //     System.out.println("it can handle all runtime Exception");
        // }
        // catch(Exception e)
        // {
        //     System.out.println("parent of all exception");
        // }
        System.out.println("after try-catch");
    }
}