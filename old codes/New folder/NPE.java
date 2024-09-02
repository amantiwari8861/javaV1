class A
{
	public static void main(String args[])
	{
		try
		{
			String x=null;
			System.out.println(x.toUpperCase());
		}
		catch(NullPointerException a)
		{
			System.out.println("please do not pass null value\n");
			a.printStackTrace();
		}
	}
}
//finally can be used with try block ex. try{}finallly{}