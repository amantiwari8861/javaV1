public class SimpleShirt
{
	public static void main(String []args)
	{
		String color="Red";
		String shirt="shirt";
		
		switch (color)
		{
			case "Blue":
			shirt = "Blue"+shirt;
			break;
			case "Red":
			shirt="Red"+" "+shirt;
			break;
			default:
			shirt="White"+shirt;
		}
		System.out.println("shirt type:"+" "+shirt);
	}
}
			
			