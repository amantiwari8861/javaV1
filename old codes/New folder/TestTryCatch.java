class TestTryCatch
{
	public static void main(String arg[])
	{
		//public  static int CalculateDiv(){
		try
		{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			//System.out.println(e);
			//throw IOException;
		}
		//return 0;
		//}
		/*finally
		{
			System.out.println("finally block");
		}*/
	}	
}