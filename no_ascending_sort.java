import java.io.*;
public class no_ascending_sort
 {

   public void input()throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a Number");
      int num=Integer.parseInt(br.readLine());
      int ctr=0,num2=num;
      while(num>0)
      {
       num/=10;
       ctr++;
      }
      int ar[]=new int[ctr];

      for(int i=0;i<ctr;i++)
       {
         ar[i]=num2%10;
         num2/=10;
       }
      int min,pos;
      for(int i=0;i<ctr;i++)
      {pos=i;
       min=ar[i];
       for(int j=i+1;j<ctr;j++)
        {
		  if(ar[j]<min)
		  {
			min=ar[j];
			pos=j;
		  }
		}
		ar[pos]=ar[i];
		ar[i]=min;

		}

		 for(int i=0;i<ctr;i++)
		 {
			 System.out.print(ar[i]);
		 }
		 System.out.println();

    }

   public static void main(String Args[])throws IOException
    {
   	no_ascending_sort ob=new no_ascending_sort();
   	ob.input();
    }

 }