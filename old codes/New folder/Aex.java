class A
{
	public static void main(String args[])
	{
		//long startTime = System.nanoTime();
		try{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println("the divide is : "+c);//nahi chali bcz excep. aa gai
		}
		catch(ArithmeticException n)
		{
			System.out.println("please pass the value except zero");
			n.printStackTrace();
		}
		System.out.println("this will execute ");
		System.out.println("this will execute ");
		System.out.println("this will execute ");
		//long stopTime = System.nanoTime();
		//System.out.println("execution time: "+(stopTime - startTime)+" nano sec");
	}
}