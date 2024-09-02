import java.util.*;
import java.io.*;
class Mapping
{
	public static void main(String args[])
	{
		Properties myprops=new Properties();
	  try
	  {
		FileInputStream fis=new FileInputStream("SERVERINFO.properties");
		myprops.load(fis);
	  }
	  catch(IOException e)
	  {
	    System.out.println("error"+e.getMessage());
	  }
	  System.out.println("server"+" "+myprops.getProperty("hostname"));
	  System.out.println("user"+" "+myprops.getProperty("username"));
	  System.out.println("password"+" "+myprops.getProperty("password"));
	}
}
	  
	  