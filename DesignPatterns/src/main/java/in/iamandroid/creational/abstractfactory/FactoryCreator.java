package in.iamandroid.creational.abstractfactory;

public class FactoryCreator {

	public static AbstractIceCreamFactory getFactory(String brand)
	{
		if (brand.equalsIgnoreCase("Vadilal")) 
		{
			return new VadilalIceCreamFactory();
		}
		else if (brand.equalsIgnoreCase("Magnum"))
		{
			return new MagnumIceCreamFactory();
		}
		return null;
	}
}
