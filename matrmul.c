#include<stdio.h>
int main()
{
    int matr1[3][3],matr2[3][3],result[3][3]={0};

    printf("enter the element in matrix 1 \n");
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            scanf("%d",&matr1[i][j]);
        }
    }
    printf("enter the element in matrix 2 \n");
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            scanf("%d",&matr2[i][j]);
        }
    }
    //logic
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            for (int k = 0; k < 3; k++)
            {
                result[i][j]=matr1[i][k]*matr2[k][j]+result[i][j];
            }
        }
    }
    
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("%d \t",result[i][j]);
        }
        printf("\n");
    }

    return 0;
}