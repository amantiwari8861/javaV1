package in.iamandroid.creational.singelton;

public class Singelton 
{
	private static Singelton singeltonInstance=null;
	private Singelton(){}
	public static Singelton getInstance()
	{
		if(singeltonInstance==null)
		{
			singeltonInstance=new Singelton();
		}
		return singeltonInstance;
	}
}