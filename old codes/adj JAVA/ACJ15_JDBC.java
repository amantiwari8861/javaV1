mport java.beans.Expression;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

// what is JDBC in java?
// JDBC stands for java database connectivity
// JDBC is java API to connect and execute code and query with program and database.

// database connectivity step
// 1.  main class
// 2.  create connection
// 3.  create statement
// 4.  execute qieries
// 5.  close allconnection




// /**
//  * ACJ15_JDBC
//  */
// public class ACJ15_JDBC
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             class.forName("data1.jdbc");
//             Connection con =DriverManager.getConnection("DESKTOP-OMMVKTF\THEKAMALNAIN", "sa", "123@123");
//             Statement stmt1=con.createStatement();
//             ResultSet rs1=stmt1.executeQuery("select * from table1");
//             while(rs1.next())
//             System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getInt(4));
//             con.close();
//         }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }
//     }
//}











// /**
//  * ACJ15_JDBC
//  */
// public class ACJ15_JDBC
// {
//     public static void main(String[] args)
//     {
//         try
//         {
//             class.forName("data1.jdbc");
//             Connection con =DriverManager.getConnection("DESKTOP-OMMVKTF\THEKAMALNAIN", "sa", "123@123");
//             Statement stmt1=con.createStatement();
//             ResultSet rs1=stmt1.executeQuery("select * from table1");
//             while(rs1.next())
//             System.out.println(rs1.getString(1)+" "+rs1.getInt(4));
//             con.close();
//         }
//         catch(Exception e)
//         {
//             System.out.println(e);
//         }
//     }
// }













// /**
//  * ACJ15_JDBC
//  */
// public class ACJ15_JDBC
// {
//     public static void main(String[] args) throws Exception
//     {
//         Class.forName("data1.jhbc");
//         Connection con = DriverManager.getConnection("DESKTOP-OMMVKTF\THEKAMALNAIN", "sa", "123@123");
//         Statement stmt1= con.createStatement();
//         int Result1=stmt1.executeUpdate("drop table1");
//         System.out.println(Result1+" after code.");
//         con.close();
//     }
// }    