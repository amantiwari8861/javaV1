import java.io.IOException;
class derived 
{
	public void par()
	{
	System.out.println("derived\n");
	}
}
class test extends derived
{
	protected void par()
	{
		System.out.println("test\n");
	}
	public static void main(String args[])
	{
		derived obj=new test();
		obj.par();
	}

}