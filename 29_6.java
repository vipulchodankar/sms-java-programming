import java.io.*;

public class 29_6
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

int ctr=0,num=0,rem=0;

for(int i=0;i<10;i++)
{
 for(int j=0;j<10;j++)
	{
	 num=ar[j];
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
	29_6 ob=new 29_6();
	ob.input();
}
}
