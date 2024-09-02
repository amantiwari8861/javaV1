class TestTryCatch2
{
	public static void main(String arg[])
	{
		try
		{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block");
		}
		System.out.println("statement 6");
	}	
}