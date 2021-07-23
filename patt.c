#include<stdio.h>
int main()
{

    for (int i = 0; i < 4; i++)
    {
        for (int j = 4; j > i; j--)
        {
            printf(" "); 
        }
        for (int k = 0; k < i; k++)
        {
                printf("* ");
        }
        printf("\n");
    }
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            printf(" "); 
        }
        for (int k = 2; k > i; k--)
        {
                printf(" *");
        }
        printf("\n");
    }
    

    return 0;
}