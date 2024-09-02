class ex
{
	public static void main(String args[])
	{
		int sum=0,j=0;
		try{
		for(int  i=0;i<args.length;i++)
		{
			sum+=Integer.parseInt(args[i]);
			j++;
		}
			System.out.println("the sum is : "+sum);
		}
		catch(NumberFormatException n)
		{
			System.out.println("the sum OF previous "+(args.length-1)+" is:"+sum);
			System.out.println("character value found at "+j+" position");
			System.out.println("please type a numeric value only ");
			n.printStackTrace();
		}
	}
}