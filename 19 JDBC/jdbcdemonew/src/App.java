import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception 
    {
        // jdbc : java database connectivity 
        // file ?

        // java(coding) JDBC API   ---->   driver(connector)    ------>     mysql(query)
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?createDatabaseIfNotExist=true","root", "1234");
            System.out.println("Connected to mysql succesfully!");
            con.close();
        }
        catch(ClassNotFoundException cf)
        {
            System.out.println("Driver not found :"+cf.getLocalizedMessage());

        }
        catch(SQLException se)
        {
            System.out.println(se.getLocalizedMessage());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }



    }
}
