import java.io.*;
public class factorials
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void factorial(int x)throws IOException
{
int fact=1;int sum=0;
for(int i=1;i<=x;i++)
 {
 fact=fact*i;
 sum+=fact;
 }
 System.out.println(fact);
}

public static void main(String Args[])throws IOException
{
factorials ob=new factorials();
ob.factorial(5);
}
}