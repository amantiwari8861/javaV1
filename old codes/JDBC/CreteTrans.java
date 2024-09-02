import java.sql.*;
public class CreateTrans
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con=DriverManager.getConnection("jdbc:sqlserver://11008-FAC2;databaseName=adventureworks;user=sa;password=1");
			con.setAutoCommit(false);
			PreparedStatement ps=con.prepareStatement("Insert Into pinki(Firstname,middlename) VALUES(?,?)");
ps.setString(1,"pinki");
ps.setString(2,"gaur");
int firstctr=ps.executeUpdate();
System.out.println("First row inserted but not committed");
 ps=con.prepareStatement("Insert Into pinki(Firstname,middlename) VALUES(?,?)");
ps.setString(1,"Krishna");
ps.setString(2,"Radhey");
int secondctr=ps.executeUpdate();
System.out.println("Second row inserted but not committed");     
con.commit();
System.out.println("Trasaction committed Please check table for data");
ps.close();
con.close();
}
catch(Exception e)
{
System.out.println("Error:"+e);
}}}
                   