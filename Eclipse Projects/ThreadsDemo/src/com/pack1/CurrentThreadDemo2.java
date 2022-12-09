// package com.pack1;

public class CurrentThreadDemo2
{
	public static void main(String args[])
	{
		Thread t= Thread.currentThread();
		System.out.println("current thread :"+t);
		t.setName("my thread");
		System.out.println("after name change:"+t);
		try
		{
			for(int n=5;n>0;n--)
			{
				System.out.println(" "+n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("main thread interrupted");
		}
	}
}