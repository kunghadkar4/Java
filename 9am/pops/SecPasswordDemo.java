import java.io.*;
class  SecPasswordDemo
{
public static void main(String[] args) 
	{
Console c=System.console();
System.out.println("enter username");
String uname=c.readLine();
System.out.println("enter password");
char pass[]=c.readPassword();
System.out.println("entered username="+uname);
System.out.println("entered password="+pass);
	}
}
