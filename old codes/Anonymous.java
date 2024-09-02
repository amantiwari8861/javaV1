abstract class person
{
	abstract void eat();
}
class Test
{
	public static void main(String args[])
	{
		person p=new person(){
		void eat()
		{
			System.out.println("hello");
		}
		};
		p.eat();
	}
}