class Aout
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[3];
			a[0]=31;
			a[1]=28;
			a[2]=29;
			System.out.println(a[3]); //4th position
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("please pass within the range value \n"+a);
		}
	}
}