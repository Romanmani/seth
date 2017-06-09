import java.util.*;
public class count
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int count=0;
while(a>0)
{
count++;
  a=a/10;
}
System.out.println(count);
}
}
