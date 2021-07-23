#include<stdio.h>

int main()
{
    int Group[5]; //1D array
    // array is static (fixed size) it's size will not grow or shrink dynamically
    //homogeneous mixture of data 
    // int arr[10]={1,2,3,4,2,2,2,2,13,233}; //pre-defined array
    // int arr2[]={10,67,7865,467,89};
    // Group[0]=10;// putting value at random position in array

    for (int i = 0; i < 5; i++)
    {
        Group[i]=10+i;
    }
    
    for (int i = 0; i < 5; i++)
    {
        printf("value at %d is %d \n",i,Group[i]);
    }

    return 0;
}