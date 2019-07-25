import java.io.*;
public class one_instead_of_zero
{

public void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int ar[]=new int[5];
int onum=0,rem,k=0;
for(int i=0;i<5;i++)
{
System.out.println("Enter Number "+(i+1)+" :");
ar[i]=Integer.parseInt(br.readLine());
}

int num1=ar[0];
for(int i=0;num1>0;i++,k++)
{
 rem=num1%10;
 if(rem==0)
  rem=1;
 onum+=rem*Math.pow(10,k);
 num1/=10;
 }
 ar[0]=onum;
 System.out.println(ar[0]);

}

public static void main(String Args[])throws IOException
{

one_instead_of_zero ob=new one_instead_of_zero();
ob.input();

}

}