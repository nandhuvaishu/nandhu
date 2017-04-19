#include<stdio.h>
#include<conio.h>
void main()
{
int a;
printf("enter");
scanf("%d",&a);

if(a%4==0){
if(a%100==0){
if(a%400==0)
    printf("LEAP");
else
printf("not a leap year");
}
else
printf("is not LEAP");}
else
printf("is not LEAP");}



