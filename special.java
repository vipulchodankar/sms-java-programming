import java.io.*;
public class special
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number to check if it is a special number");
int n=Integer.parseInt(br.readLine());

int n2=n;
int n3=n;
int r,sum=1;
int sum2=0;
for(int i=1;n>0;i++)
{
n3=n%10;

for(int j=1;j<=n3;j++)
sum*=j;

sum2+=sum;
n/=10;
sum=1;
}

if(sum2==n2)
System.out.println(n2+" is a special number");
else
System.out.println(n2+" is not a special number");

}
public static void main(String Args[])throws IOException
{
special sp=new special();
sp.cal();
}
}