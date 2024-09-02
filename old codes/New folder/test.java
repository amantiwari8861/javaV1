class test
{
	test()
	{
		System.out.println("constructor");
	}
	static
	{
		System.out.println("static block");
	}
	
	{System.out.println("init block");}
	
	static void msg()
	{
		System.out.println("static method");
	}
	public static void main(String args[])
	{
		System.out.println("main methods");
		test t=new test();
		t.msg();
	}
}