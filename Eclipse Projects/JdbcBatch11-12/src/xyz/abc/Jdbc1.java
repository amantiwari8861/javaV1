package xyz.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc1 {

	public static void main(String[] args) {

		//JDBC - java database connectivity
		// type 4 jdbc drivers 
		String url="jdbc:sqlserver://localhost:1433;databaseName=TestJDBC;user=sa;password=test1234;encrypt=true;trustServerCertificate=true;";
		
		
		try 
		{
			//load driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//driver class of db
			Connection con = DriverManager.getConnection(url);
			System.out.println("Succesfully connected");
			
			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery("select * from courses;");
//			
//			while(rs.next())
//			{
//				System.out.println(rs.getInt("id")+" "+rs.getString(2)+" "+rs.getString(3));
//			}
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter course name :");
			String course = sc.nextLine();
//			float price = sc.nextFloat();
//			String query="insert into courses(name,price)  values('"+course+"',"+price+");";
//			String query2="update courses set price="+price+" where name='"+course+"';";
			String query3="delete from courses where name='"+course+"'";
			
			System.out.println(query3);
			int status = st.executeUpdate(query3);//DML (insert,update,delete)
			
			if(status >0)
			{
//				System.out.println("data inserted succesfully!");
//				System.out.println("data updated succesfully!");
				System.out.println("data deleted succesfully!");
			}
			else
			{
				System.out.println("not inserted");
			}
			
			
			
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
		//String url = "jdbc:sqlserver://suraj\\HEMANTSQL;databaseName=feb2022;";
		//Connection con2 = DriverManager.getConnection(url, "sa", "Aman@8861");
		//Open SQL Server Configuration Manager, and then expand SQL Server 2012 Network Configuration.
		//Click Protocols for InstanceName, and then make sure TCP/IP is enabled in the right panel and double-click TCP/IP.
		//On the Protocol tab, notice the value of the Listen All item.
		//Click the IP Addresses tab: If the value of Listen All is yes, the TCP/IP port number for this instance of
		//SQL Server 2012 is the value of the TCP Dynamic Ports item under IPAll. If the value of Listen All is no,
		//the TCP/IP port number for this instance of SQL Server 2012 is the value of the TCP Dynamic Ports item for a specific IP address.
		//Make sure the TCP Port is 1433.
		//Click OK.








