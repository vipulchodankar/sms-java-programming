import java.io.*;
public class grt
{
public void check()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no1");
int no1=Integer.parseInt(br.readLine());
System.out.println("Enter no2");
int no2=Integer.parseInt(br.readLine());
System.out.println("Enter no3");
int no3=Integer.parseInt(br.readLine());

if(no1>no2 && no1>no3)
	System.out.println(no1+" Is the greatest number ;)");
else if(no2>no1 && no2>no3)
	System.out.println(no2+" Is the greatest number");
else
	System.out.println(no3+" Is the greatest number");
}
public static void main(String Args[])throws IOException
{
grt ob=new grt();
ob.check();
}}