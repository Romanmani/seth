#include<stdio.h>
void main()
{
int i,j,a[10],n;
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
printf("lowest no %d\n",a[0]);
printf("highest no %d\n",a[n-1]);
}
