import java.io.*;
class pg184q6e
{
public static void main(String Args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter no. of digits");
int n=Integer.parseInt(br.readLine());
int sum=1;
int s=0;
for(int i=1;i<n;i++)
{
sum=sum+1*10+1;
s=s+sum;
}
System.out.println(s);
}
}