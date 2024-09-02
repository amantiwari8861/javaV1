class PrivateAccess
{	
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.setvar(112);
		System.out.println("the value is "+d.getvar());
	}
}
class Demo
{
	private int var;
	public int setvar(int num)
	{
		this.var=num;
	}
	public int getvar()
	{
		return this.var;
	}

}