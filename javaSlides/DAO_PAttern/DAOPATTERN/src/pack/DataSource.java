/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;

public class DataSource
{
  Connection      connection = null;
  BasicDataSource bdSource   = new BasicDataSource();

  public DataSource()
  {
    bdSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
    bdSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
    bdSource.setUsername("system");
    bdSource.setPassword("1");
  }

  public Connection createConnection()
  {
    Connection con = null;
    try
    {
      if( connection != null )
      {
        System.out.println("Cant create a New Connection");
      }
      else
      {
        con = bdSource.getConnection();
      }
    }
    catch( Exception e )
    {
      System.out.println("Error Occured " + e.toString());
    }
    return con;
  }
}