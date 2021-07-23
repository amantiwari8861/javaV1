#include<stdio.h>

int main()
{
    // int twod[3][4]={
    //     {10,20,30,40},
    //     {40,50,60,30},
    //     {70,80,90,20}
    // };
    int twod[3][4];  //n dimension  3*4

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            scanf("%d",&twod[i][j]);
        }
    }
    

    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 4; j++)
        {
            //printf("twod[%d][%d] = %d \n",i,j,twod[i][j]);
            printf("%d \t",twod[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}