import java.io.*;
public class primeadd
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int num=Integer.parseInt(br.readLine());
int rem;
int num1=num;
int sum=0;
while(num>0)
{
rem=num%10;
if(rem==2 || rem==3 || rem ==5 || rem==7)
{sum=sum+rem;}
num=num/10;
}
System.out.println("sum of prime digits of "+num1+" = "+sum);
}
public static void main(String Args[])throws IOException
{
primeadd ob=new primeadd();
ob.cal();
}
}