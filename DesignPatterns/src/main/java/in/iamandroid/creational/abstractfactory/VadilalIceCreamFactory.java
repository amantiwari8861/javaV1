package in.iamandroid.creational.abstractfactory;

public class VadilalIceCreamFactory extends AbstractIceCreamFactory
{
	public IceCream createIceCream(String flavour)
	{
		IceCream iceCream=null;
		if (flavour.equalsIgnoreCase("Strawberry")) 
		{
			iceCream=new StrawberryIceCream("Vadilal",20,120);
		}
		else if (flavour.equalsIgnoreCase("chocolate")) 
		{
			iceCream=new ChocolateIceCream("Vadilal",10,250);
		}
		return iceCream;
	}
}