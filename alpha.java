import java.util.*;
public class alpha
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String a=s.nextLine();
char n=a.charAt(0);
if(n>=65 && n<=95|| n>=97 && n<=122)
{
System.out.println("alpha");
}
else
{
System.out.println("not alpha");
}
}
}
