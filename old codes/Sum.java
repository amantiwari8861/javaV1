public class Sum
{
	public static void main(String args[])
	{
		int num=0;
		for(int i=0;i<args.length;i++)
		{
			num+=Integer.parseInt(args [i]);
		}
	  System.out.println("the sum of "+num);
	}
}