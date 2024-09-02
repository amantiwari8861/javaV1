interface College
{
	void roll_no();
	void admission_date();
	void complete_date();
}
interface Library
{
	void books();
}
class Science implements College,Library
{
	int bknm;
	public void setbooks(int book)
	{
		
		bknm=book;
	}
	public int getbooks()
	{
		return bknm;
	}
	public void roll_no()
	{
		System.out.println("science");
	}
	public void admission_date()
	{
		System.out.println("15 Aug 2019");
	}
	public void complete_date()
	{
		System.out.println("15 Aug 2022");
	}
}
class Commerce implements College
{
	public void roll_no()
	{
		System.out.println("commerce");
	}
	public void admission_date()
	{
		System.out.println("15 Aug 2019");
	}
	public void complete_date()
	{
		System.out.println("15 Aug 2022");
	}
}
class Arts implements College
{
	public void roll_no()
	{
		System.out.println("arts");
	}
	public void admission_date()
	{
		System.out.println("15 Aug 2019");
	}
	public void complete_date()
	{
		System.out.println("15 Aug 2022");
	}
}

class Display
{
	public static void main(String args[])
	{
		Science sc=new Science();
		Commerce com=new Commerce();
		Arts ar=new Arts();
		sc.roll_no();
		sc.admission_date();
		sc.complete_date();
		com.roll_no();
		com.admission_date();
		com.complete_date();
		ar.roll_no();
		ar.admission_date();
		ar.complete_date();
		
		sc.setbooks(12);
		System.out.println("the book name is"+" "+sc.getbooks());
	}
}