impot jav.util.*;
public class palindrome
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int p,o,s=0,t;
t=a;
while(a>0)
{
p=a%10;
o=(o*10)+p;
a=a/10;
}
if(t==o)
{
System.out.println("Is palindrome");
}
else
{
System.out.println(Is not palindrome");
}
}
}
