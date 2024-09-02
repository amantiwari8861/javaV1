class Dog 
{
	private int weight;
	public int getweight()
	{
		return weight;
	}
	public void setweight(int newweight)
	{
		if(newweight>0)
		{
			weight=newweight;
		}
	}
}
public class TestDog
{
	public static void main(String []args)
	{
		Dog d=new Dog();
		System.out.println("dog's weight is"+d.getweight()); // 0
		d.setweight(42);
		System.out.println("dog's weight is"+d.getweight()); //42
		d.setweight(-42);
		System.out.println("dog's weight is"+d.getweight()); // 42
	}
}