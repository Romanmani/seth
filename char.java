import java.util.*;
public class char
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String a=s.nextLine();
char n=Character.toString(a);
if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
{
System.out.println("vowels");
}
else
{
System.out.println("consonant");
}}
}
