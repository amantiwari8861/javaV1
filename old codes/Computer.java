class ElectronicDevice
{

	public enum PowerState
	{
	OFF,ONN,SUSPENDED;
	}


}
	public class Computer extends ElectronicDevice
	{
		Computer comp=new Computer();
		public void Computer()
		{
			System.out.println("xyz");
		}
	public static void main(String []args)
	{	
		
		PowerState PS=PS.ONN;
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