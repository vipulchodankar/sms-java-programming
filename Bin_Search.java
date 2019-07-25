import java.io.*;
public class Bin_Search
{

 public static void main(String Args[])throws IOException
 {
	 Bin_Search ob=new Bin_Search();
	 ob.input();
 }

 public void input()throws IOException
 {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  	 int ar[]=new int[5];
  	 int temp=0;

  	 for(int i=0;i<ar.length;i++)
  	 {
		 System.out.println("Enter number"+(i+1)+" :");
		 ar[i]=Integer.parseInt(br.readLine());
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
	 int lb=0,ub=ar.length-1,mid=(ub+lb)/2,pos=-1;
  	 System.out.println("Enter value to be searched!");
  	 int num=Integer.parseInt(br.readLine());

  	 while(ub>=lb)
  	  {
	    if(num==ar[mid])
	    {
		 pos=mid;
		 break;
		}

		else if(num>ar[mid])
		{
		 lb=mid+1;
		mid=(ub+lb)/2;
		}

		else if(num<ar[mid])
		{
		 ub=mid-1;
		 mid=(ub+lb)/2;
		}
	}

	if(pos==-1)
	System.out.println("NOT FOUND!!!!!");
	else
	 System.out.println("Position Of "+num+" is "+pos);
 }
}