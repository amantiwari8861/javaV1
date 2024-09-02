public class ArrayOperations
{
	public static void main(String args[])
	{
		String [] names=new String[3];
		names[0]=" blue shirt";
		names[1]=" red shirt";
		names[2]=" black shirt";
		
		int [] numbers={100,200,300};
		for(String name :names)
		{
			System.out.println("name"+" "+name);
		}
		for(int number:numbers)
		{
			System.out.println("number"+" "+number);
		}
		System.out.println("####separation line####");
	 for(int i=0;i<3;i++)
	 {
		System.out.println("this is using simple loop"+" "+names[i]);
	 }
    }
}