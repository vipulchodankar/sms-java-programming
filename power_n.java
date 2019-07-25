import java.io.*;
public class power_n
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number ");
int x=Integer.parseInt(br.readLine());

System.out.println("Enter a power");
int n=Integer.parseInt(br.readLine());

int s=0;
for(int i=1;i<=n;i++)
{
s=s+(int)Math.pow(x,i);
}

System.out.println("sum = "+s);
}
public static void main(String Args[])throws IOException
{
power_n ob=new power_n();
ob.cal();
}
}