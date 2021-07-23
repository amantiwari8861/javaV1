#include<stdio.h>
#include<math.h>
//  Write a program in C to display the sum of the series

int main()
{
    int x,term,i,temp=1,deno;
    float result=1.0;
    printf("enter the value of x and term \n");
    scanf("%d%d",&x,&term);
    for ( i = 1; i < term; i++)
    {
        result= pow(x,i)/temp*i;

        
    }
    printf("the result is %0.2f \n",result);

    return 0;
}