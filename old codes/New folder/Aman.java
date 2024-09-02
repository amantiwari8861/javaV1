interface Aman
{
	void car();
	
	default void audi()
	{
		
	}
	
	static void ferrari()
	{
		
	}
}

class A implements Aman
{
	public void car()
	{
		System.out.println("hii");
	}
}
class B implements Aman
{
	public void car()
	{
		System.out.println("hello");
	}
}
class C implements Aman
{
	public void car()
	{
		System.out.println("whats'up");
	}
}
class Display
{
	public static void main (String args[])
	{
		A a=new A();
		a.car();
	}
}