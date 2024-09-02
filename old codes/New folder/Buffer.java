import java.io.*;
class Buffer
{
	public static void main(String args[])
	{
	String name;
	int age;
	try
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		name=br.readLine();
		System.out.println("Enter Age");
		age=Integer.parseInt(br.readLine());
		System.out.println("my name is "+name);
		System.out.println("my age is "+age);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	/*InputStreamReader = reads binary to convert into character
	Read line= characters to string
	Integer.parseInt(br.readLine()); = casting in integer 
	Q. What is File Handling ?
	ans.self
	*/
}