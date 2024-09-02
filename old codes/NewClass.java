
import java.sql.*;

public class NewClass 
{
    
    public static void main(String[] args)
    {
        try
        {
            String str="SELECT * FROM Aman.MyEmployee";

			
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","1");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(str);
            System.out.println("EmplyeeID\tName\tAge");
            
            while(rs.next())
            {
                String EmployeeID=rs.getString("EmployeeID");
                String name=rs.getString("Name");
                String Age=rs.getString("Age");
                System.out.println(EmployeeID+"\t");
                        System.out.println(name+"\t\t");
                                System.out.println(Age);
                                        
            }
            con.close();
        }
        catch(Exception e)
        {   
            System.out.println("Error occured");
                    System.out.println("Error:"+e);
        }
    
}
}
