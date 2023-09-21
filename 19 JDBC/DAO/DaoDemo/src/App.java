import util.ConnectionProvider;

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Hello, World!");

        ConnectionProvider.getMySqlConnection();
    }
}