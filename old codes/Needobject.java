class Needobject
{
	int ID;
	String name;
	int age;
    public Needobject()
{
	ID=500;
	name="My name";
	age=26;
}
	public static void main(String args[])
{
		Needobject ob1=new Needobject();
		System.out.println("this is my object"+" "+ob1);
		Needobject ob2=new Needobject();
		
		ob1.ID=101;
		ob1.name="AMAN";
		ob1.age=26;
		
		ob2.ID=102;
		ob2.name="naman";
		ob2.age=15;
		
		System.out.println("this is belongs to ob1"+" "+ob1.ID+" "+ob1.age+" "+ob1.name);
		System.out.println("this is belongs to ob2"+" "+ob2.ID+" "+ob2.age+" "+ob2.name);
}
}
		