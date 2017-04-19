#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,c;
printf("enter");
scanf("%d %d %d",&a,&b,&c);
if(a>b&&a>c)
printf("a is a greatest no");
if(b>a&&b>c)
printf("b is a greatest no");
if(c>b&&c>a)
printf("c is a greatest no");
getch();
}
