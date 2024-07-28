package in.iamandroid.creational.prototype;

public class Virus implements Cloneable
{
	public void createVirus()
	{
		try 
		{
			Virus v=(Virus)this.clone();
			System.out.println(v.hashCode());
		} 
		catch (CloneNotSupportedException e) 
		{
			e.printStackTrace();
		}
	}
}