import java.sql.*;
class NewClass
{
public static void main(String args[])
{
  try
  {
    /*Initialize and load the Type 4 driver*/
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    /*Establish a connection with the database*/
    Connection con = DriverManager.getConnection("jdbc:sqlserver://11008-FAC2;databaseName=adventureworks;user=sa;password=1");
   /*Create an SQL statement*/
    String str= "SELECT * FROM person.contact";
    Statement stmt = con.createStatement();
   /*Execute an SQL statement*/
    ResultSet rs = stmt.executeQuery(str);
    ResultSetMetaData rsmd = rs.getMetaData();
    rs.next();
   /*Retrieve the number of columns in a ResultSet*/
System.out.println("Number of Attributes in the authors Table:"+rsmd.getColumnCount());
  	System.out.println("");
System.out.println("-------------------------------------");
  	System.out.println("Attributes of the “+args[0]+” Table");
  	System.out.println("-------------------------------------");
/*Retrieve and display the names and data types of various columns in a ResultSet*/
  	for(int i = 1; i <= rsmd.getColumnCount(); i++)
  	{
System.out.println(rsmd.getColumnName(i) + " : " + rsmd.getColumnTypeName(i));
  	}
 	/*Close the ResultSet object*/  
rs.close();
/*Close the Statement object*/
stmt.close();
 }
  catch(Exception e)
  {
      System.out.println("Error : " + e);
  }
 }
}


