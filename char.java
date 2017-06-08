import java.util.*;
public class char
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String x=s.nextLine();
char n=x.charAt(0);
if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
{
System.out.println("vowels");
}
else
{
System.out.println("consonant");
}}
}
