import java.io.*;

public class Jun29
{

public void input()throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int ar[]=new int[10];

for(int i=0;i<10;i++)
{
	System.out.println("Enter number "+(i+1)+" :");
	ar[i]=Integer.parseInt(br.readLine());
}

int ctr=0,num,rem=0;

for(int i=0;i<ar.length;i++)
{
	num=Math.abs(ar[i]);
 	if(num==0)
 	ctr++;
 	while(num>0)
	{
	 rem=num%10;
	 if(rem==0)
	 ctr++;
	 num/=10;
	}
}
System.out.println("No. of zeros = "+ctr);
}

public static void main(String Args[])throws IOException
{
	Jun29 ob=new Jun29();
	ob.input();
}
}
