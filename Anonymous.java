abstract class person
{
	abstract void eat(); //no body
}
class Test
{
	public static void main(String args[])
	{
        // person obj=new person(); //error we can't make abstract class object
		person p=new person()
		{
            void eat()
            {
                System.out.println("hello");
            }
		};
		p.eat();
	}
}