class NewThread extends Thread
{
	NewThread()
	{
		super("demo thread");
		System.out.println("child thread :"+this);
		start();
	}
	public void run()
	{
	    try 
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("child thread:"+i);
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("child thread intruppted");
		}
		System.out.println("existing child thread");
	}
}
        class  ExtendThread
		{
			public static void main(String args[])
			{
				new NewThread();
				try{
					for(int i=5;i>0;i--)
					{
						System.out.println("main thread :"+i);
						Thread.sleep(2000);
					}
				}
				catch(InterruptedException e)
				{
					System.out.println("main thread intruppted.");
				}
				System.out.println("main thread exiting");
			}
		}