package com.pack;

import java.sql.*;
public class BookInfo
{
	public static void main(String args[])
	{
	try
        {
		        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con=DriverManager.getConnection("jdbc:sqlserver://11008-FAC2;databaseName=adventureworks;user=sa;password=1");
			Statement stmt=con.createStatement();
                        con.setAutoCommit(false);
                        stmt.addBatch("Insert INTO pinki(firstname,middlename)VALUES('aaa','bbb')");
                        stmt.addBatch("Insert INTO pinki(firstname,middlename)VALUES('ccc','ddd')");
                        stmt.addBatch("Insert INTO pinki(firstname,middlename)VALUES('eee','fff')");
                        int[] results=stmt.executeBatch();
                        System.out.println("");
                        System.out.println("Using statement objects");
                        System.out.println("---------------------------------------------");
                            for(int i=0;i<results.length;i++)
                            {
                                System.out.println("Rows affected by"+(i+1)+"Insert Statement:"+results[i]);
                            }
                        stmt.close();
                        PreparedStatement ps=con.prepareStatement("Insert INTO gaur1(code,age)VALUES(?,?)");
                        System.out.println("");
                        System.out.println("------------------------------------------");
                        System.out.println("Using PreparedStatement Objects");
                        System.out.println("------------------------------------------");
                        System.out.println("");


                        ps.setString(1,"A001");
                        ps.setString(2,"25");
                        ps.addBatch();


                        ps.setString(1,"B001");
                        ps.setString(2,"28");
                        ps.addBatch();
                        int[]numupdates=ps.executeBatch();
                        for(int i=0;i<numupdates.length;i++)
                        {
                                System.err.println("Rows affected by"+(i+1)+"Insert Statement:"+numupdates[i]);
                        }
                        con.commit();
                        con.close();
                        }
        
                        catch(BatchUpdateException bue)
                        {
                                System.out.println("Error:"+bue);
                        }
                        catch(SQLException sqle)
                        {
                                System.out.println("Error:"+sqle);
                        }

                         catch(Exception e)
                        {
                                System.out.println("Error:"+e);
                        }
}
}

















