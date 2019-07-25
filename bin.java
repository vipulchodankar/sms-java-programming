import java.io.*;
public class bin
{
public bin()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter integer number");
int num=Integer.parseInt(br.readLine());
int rem=0;
String bin="";
int onum=num;
while(num>0)
{
  rem=num%2;
  bin=String.valueOf(rem)+bin;
  num/=2;
}
System.out.println("Binary value of "+onum+" is = "+bin);
}
public static void main(String AArgs[])throws IOException
{
bin ob=new bin();
}
}