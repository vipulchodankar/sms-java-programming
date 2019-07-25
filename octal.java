import java.io.*;
public class octal
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int num=Integer.parseInt(br.readLine());
int rem=0;
String oct="";
int onum=num;
while(num>0)
{
  rem=num%8;
  oct=String.valueOf(rem)+oct;
  num/=8;
}
System.out.println("Octal value of "+onum+" is = "+oct);
}
public static void main(String Args[])throws IOException
{
System.out.println(10*11*12*13*14*15*16*17*18*19*20);
octal ob=new octal();
ob.cal();
}
}