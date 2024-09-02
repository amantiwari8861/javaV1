import java.sql.*;
 class NewClass
{
	public static void main(String args[])
	{
	String str="CREATE PROCEDURE authors_info_prmtz @auth_id varchar(15),@auth_name varchar(20)output,@auth_city varchar(20)output,@auth_state varchar(20) output AS SELECT @auth_name=Firstname,@auth_city=middlename,@auth_state=lastname FROM person.contact Where contactid=@auth_id";
       

        String id,name,address,city;
		try
		{ 
                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con=DriverManager.getConnection("jdbc:sqlserver://DEL-AGR-FLM5;databaseName=adventureworks;user=sa;password=1");
                        Statement stmt=con.createStatement();
                        int rt=stmt.executeUpdate(str);
			String str1="{call authors_info_prmtz(?,?,?,?)}";
			
                        CallableStatement cstmt=con.prepareCall(str1);
                        cstmt.setString(1,"2000");
                        cstmt.registerOutParameter(2,Types.VARCHAR);
                        cstmt.registerOutParameter(3,Types.VARCHAR);
                        cstmt.registerOutParameter(4,Types.VARCHAR);
                        cstmt.execute();
                        name=cstmt.getString(2);
                        address=cstmt.getString(3);
                        city=cstmt.getString(4);
                        System.out.println("   ");

                        System.out.println("Displaying Author Information");

                        System.out.println("-----------------------------");

                        System.out.println("First Name:"+name);
                        System.out.println("Last Name:"+address);
                        System.out.println("Middle Name:"+city);
                        cstmt.close();
                        con.close();
}
catch(Exception e)
{
System.out.println("Error"+e);
}
}
}



















