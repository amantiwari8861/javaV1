public class PredictOutput
{
	static int a;
	int b;
	static  //static block
	{
		a=100;
		System.out.println("i am called when class is first loaded");
	}
	{
		System.out.println("hiii");
	}
	MyStaticDemo()
	{
		b=200;
        System.out.println("constructor called");
	}
	public void nonstaticfunction()
	{
	    System.out.println("this is NON static app"+" "+b);
	}
	public static void Display()
	{
		System.out.println("this is static app"+" "+a);
	}
	public static void main(String []args)
	{
		System.out.println(a); //100
		System.out.println("checking null either default"+" "+ok.b);
		MyStaticDemo ok=new MyStaticDemo();
		ok.nonstaticfunction();
		Display();
		MyStaticDemo.Display();
		System.out.println(ok.b);
	}
}
	