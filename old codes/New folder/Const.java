class Constant
{
	public Constant()
	{
		
		System.out.println("hello i am a default constructor  ");
	}
}


class Constant12
{
	public static void main(String args[])
	{
		System.out.println("hello i am main");
		Constant obj=new Constant();
		System.out.println("i will execute after constructor");
	}
}