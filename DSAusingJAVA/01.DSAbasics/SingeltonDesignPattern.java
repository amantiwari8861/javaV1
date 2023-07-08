class Singelton
{
	private static Singelton singeltonInstance;
	private Singelton()
	{
	}
	public static Singelton getsingeltonInstance()
	{
		if(null==singeltonInstance)//runs only 1st time
		{
			singeltonInstance=new Singelton();
			System.out.println("inside null check object is created :"+singeltonInstance.toString());
			System.out.println("------------------------------------------------------------------");
		}
		return singeltonInstance;
	}
	public void printSingelton()
	{
		System.out.println("inside print singelton object"+singeltonInstance);
	}
}
public class SingeltonDesignPattern
{
	void greet()
	{
		System.out.println("hiiii");
	}
	public static void main(String []args)
	{

		Singelton ob=Singelton.getsingeltonInstance();
		ob.printSingelton();
		Singelton.getsingeltonInstance().printSingelton();
		Singelton.getsingeltonInstance().printSingelton();
		Singelton.getsingeltonInstance().printSingelton();

		SingeltonDesignPattern sd=new SingeltonDesignPattern();
		sd.greet();

		new SingeltonDesignPattern().greet();

	}
}
		