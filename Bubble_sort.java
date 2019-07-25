import java.io.*;
public class Bubble_sort
{
	public void input()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. of numbers");
		int num=Integer.parseInt(br.readLine());
		int ar[]=new int[num];
		int temp;

		for(int t=0;t<ar.length;t++)
		{
			System.out.println("Enter number"+(t+1)+" :");
			ar[t]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println();
		for(int t=0;t<ar.length;t++)
			System.out.println(ar[t]);

		System.out.println("C ya Later!");
		}

		public static void main(String Args[])throws IOException
		{
			Bubble_sort ob=new Bubble_sort();
			ob.input();
		}
}