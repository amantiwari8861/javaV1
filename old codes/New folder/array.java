class sort
{
	int i,temp,pass;
	void display()
	{
		for(i=0;i<5;i++)
		{
		System.out.println("the unsorted arrays are "+arr[i]);
		}
	}
	void sorting()
	{
		do
		{
			for(i=0;i<5-1-pass;i++)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			pass++;
		}while(pass<=5-1);
	}
	void show()
	{
		for(i=0;i<5;i++)
		{
		System.out.println("the unsorted arrays are "+arr[i]);
		}
	}
	public static void main(String args[])
	{
		// int[] arr;
		int arr[]={1,6,2,8,3}; 
		// arr =new int[1,2,6,1,10];
		sort s=new sort();
		s.display();
		s.sorting();
		s.show();
	}
}