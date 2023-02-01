class ThrowsExample
{
	public static void main(String args[]) 
	{
		System.out.println("hii i am  main");
		m1();
	}
	static void m1() throws ArithmeticException
	{
		m2();     
	}
	static void m2() throws ArithmeticException
	{
		try{
		m3();
		}
		catch(ArithmeticException a)
		{
			System.out.println("Handeled");
		}
	}
	static void m3() throws ArithmeticException
	{
		System.out.println(10/0);
		System.out.println("hiii");
	}
}