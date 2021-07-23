class ThrowsExample
{
	public static void main(String args[]) throws ArithmeticException
	{
		
		System.out.println("hii i am  main");
		m1();
     
	}
	static void m1() throws ArithmeticException
	{
		try {
			m2();	
		} catch (ArithmeticException e) {
			System.out.println("handled");
		}        
	}
	static void m2() throws ArithmeticException
	{
		m3();
	}
	static void m3() throws ArithmeticException,IllegalArgumentException
	{
		System.out.println(10/0);
	}
}