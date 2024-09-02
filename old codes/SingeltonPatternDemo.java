 class Singelton
{
	private static Singelton Singeltoninstance;
	private Singelton()
	{
	}
	public static Singelton getSingeltoninstance()
	{
		if(null==Singeltoninstance)
		{
			Singeltoninstance=new Singelton();
			System.out.println("inside null check object is created :"+Singeltoninstance.toString());
			System.out.println("------------------------------------------------------------------");
		}
		return Singeltoninstance;
	}
	public void printSingelton()
	{
		System.out.println("inside print singelton object"+Singeltoninstance);
		System.out.println(" ");
	}
}
public class SingeltonPatternDemo
{
	public static void main(String []args)
	{
		Singelton ob=Singelton.getSingeltoninstance();
		ob.printSingelton();
		Singelton.getSingeltoninstance().printSingelton();
				Singelton.getSingeltoninstance().printSingelton();
						Singelton.getSingeltoninstance().printSingelton();
	}
}
		