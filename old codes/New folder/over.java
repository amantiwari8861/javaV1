import java.io.IOException;
class derived 
{
	public void par() throws IOException
	{
	System.out.println("derived\n");
	}
}
class test extends derived
{
	public void par() throws Exception
	{
		System.out.println("test\n");
	}
	public static void main(String args[]) throws IOException
	{
		derived obj=new test();
		obj.par();
	}

}