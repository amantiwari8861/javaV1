public class tryCatch3
{
    public static void main(String[] args) {
        System.out.println("before try");
        try {
            String var=null;
            System.out.println(var.length()); //null
            System.out.println("hello i will never execute if exception occurs above");
        }
        catch(Throwable e)
        {
            System.out.println("parent of all exception");
        }
        System.out.println("after try-catch");
    }
}