package com.niit;
public class EncapTest1
{
	private String name;
	private String Idnum;
	private int age;
	public EncapTest1(String name,String idnum,int age)
	{
		this.name=name;
		this.Idnum=Idnum;
		this.age=age;
	}
				public int getAge()
				{
					return age;
				}
					public String getName()
					{
						return name;
					}
						public String getIdnum()
						{
							return Idnum;
						}
}