public class enum PowerState
	{
		OFF,ONN,SUSPENDED
	}
	public class Computer
	{
		Computer comp=new Computer();
	public static void main(String []args)
	{	
		switch(PS)
		{
			case OFF:
			System.out.println("my device is off");
			break;
			case ONN:
			System.out.println("my device is on");
			break;
			case SUSPENDED:
			System.out.println("my device is SUSPENDED");
			break;
			default:
			System.out.println("invalid state");
		}
	}		
}		
		