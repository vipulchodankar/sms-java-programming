import java.io.*;
public class PG226_Q2
{
public static void main(String Args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String date;
System.out.println("Enter date in format given- DD/MM/YYYY format " );
date=br.readLine();

int dd=Integer.parseInt(date.substring(0,2));
int mm=Integer.parseInt(date.substring(3,5));
int yyyy=Integer.parseInt(date.substring(6));

if(dd>0 && dd<32)
System.out.println("Day; "+dd);
else
System.out.println("Invalid day");

if(mm>0 && mm<13)
System.out.println("Month:"+mm);
else
System.out.println("Invalid Month");

if(yyyy>1989 && yyyy<2016)
System.out.println("Year: "+yyyy);
else
System.out.println("Invalid Year");
 }
 }