#include<stdio.h>

int main()
{
	int arr[5],arr2[5],i,sum=0;
	printf("enter an array\n");
	for(i=0;i<5;i++)
	{
		scanf("%d%d",&arr[i],&arr2[i]);
	}
	for(i=0;i<5;i++)
	{
		sum=arr[i]+arr2[i]+sum;
	}

		printf("the sum of the array value is %d\n",sum);
}