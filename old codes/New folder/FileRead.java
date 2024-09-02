import java.io.*;
class FileRead
{
	//public static void main(String args[]) throws IOException
	public static void main(String args[])
	{
		try{
		FileReader niit=new FileReader("output.txt");
		BufferedReader br=new BufferedReader(niit);
		System.out.println(br.readLine());
		}
		catch(FileNotFoundException f)
		{
			System.out.println("file not found caught");
		}
		catch(IOException f)
		{
			System.out.println("io exception found caught");
		}
	}
	/*
		used to read data from file
	*/
}