import java.io.*;
public class ISBN
{
public static void main(String Args[])throws IOException
{
System.out.println("Enter ISBN");
String no=br.readLine();

char ch;int ch2;
int count1=0;
if(no.length()==10)
 {for(int i=0;i<10;i++)
 {
  ch=no.charAt(i);
  if(ch.isDigit())
   {count1++; }
 }
}
else
 {System.out.println("Illegal ISBN");
	 System.exit(0);
}

if(count1==10)
{
 for(int j=0;j<10;j++)
{
	ch2=(int)no.charAt(j);
	sum=sum+(ch2*(j+1));
}
}}