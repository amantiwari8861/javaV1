class ThrowsExample
{
	//public static void main(String args[])  throws ArithmeticException
	public static void main(String args[])
	{
		
		System.out.println("hii i am  main");
		try{
		m1();
		}
		catch(ArithmeticException a)
		{
			System.out.println("error handled!");
		}
	}
	static void m1() throws ArithmeticException
	{
		m2();
	}
	static void m2() throws ArithmeticException
	{
		m3();
	}
	static void m3() throws ArithmeticException
	{
		System.out.println(10/0);//exception occured
	}
}