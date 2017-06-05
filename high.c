#include<stdio.h>
void main()
{
int i,j,a[10],n;
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",a[i]);
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;i++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
printf("%d",a[0]);
printf("%d",a[n-]);
}
