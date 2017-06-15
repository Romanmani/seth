import java.util.*;
public class power
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int no=s.nextInt();
int pow=s.nextInt();
int sum=1;
for(int i=0;i<=pow;i++)
{
sum=sum*no;
}
System.out.println(sum);
}
}
