import java.io.*;
public class series3
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

public void ser1()throws IOException
{
 System.out.println("Enter a number");
 int n=Integer.parseInt(br.readLine());
 int s=0;
  for(int i=1;i<=n;i++)
 {
   if(i%2==0)
    s=s-i;
   else
    s=s+i;
 }
System.out.println("Sum of numbers = "+s);
}

public void ser2()throws IOException
{
 double sum=0;
  for(double i=1;i<=15;i++)
   {
    sum+=i/++i;
   }
  System.out.println("sum = "+sum);
 }

 public static void main(String Args[])throws IOException
 {
 series3 ob=new series3();
 ob.ser1();
 ob.ser2();
}
}