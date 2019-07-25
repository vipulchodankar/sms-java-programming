import java.io.*;
public class pg184q6d
{
public static void main(String Args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a number : ");
int n=Integer.parseInt(br.readLine());

int sum=0;
int s=0;
for(int i=1;i<=n;i++)
{
sum=sum*10+i;
s=s+sum;

}
System.out.println(s);
}
}