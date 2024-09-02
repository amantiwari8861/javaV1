import java.io.*;
class FileWrite
{
	public static void main(String args[]) throws IOException
	{
	/*String str="hello";
	String name;
	try
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		name=br.readLine();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}*/
		FileWriter niit=new FileWriter("output.txt");	
		niit.write("hello how r u ");
		//niit.write(name);
		niit.close();
	/*
		used to write data in file
	*/
	}
}