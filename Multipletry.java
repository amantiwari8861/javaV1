class tryCatch2
{
    public static void main(String[] args) {
        System.out.println("before try");
        try {
            System.out.println("in try block");
            try{
                String var=null;
                System.out.println("the value of var :"+var);
                System.out.println(" the length is :"+var.length()); // null pointer exception
            }
            catch(NullPointerException n)
            {
                System.out.println("handled null pointer exception");
            }
            System.out.println(1/0); //infinity
            System.out.println("hello i will never execute if exception occurs above");
        }
        catch(ArithmeticException a)
        {
            System.out.println("divided by zero condition");
        }
        finally
        {
            System.out.println("i will run always either exception occur or not ");
        }
        System.out.println("after try-catch");
    }
}