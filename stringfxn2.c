#include<stdio.h>
#include<string.h>
int main()
{
    char name[4];
    char name2[20];
    gets(name);
    gets(name2);
    fflush(stdin);
    //int len=strlen(name);
    // printf("the length is %d \n",len);
    // printf("the fullname is %s \n",strcat(name,name2));
    // puts(strrev(name));
    // puts(strlwr(name));
    // puts(strupr(name));
    printf("the result is %d \n",strcmp(name,name2));
    return 0;
}