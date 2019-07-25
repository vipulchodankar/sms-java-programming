import java.io.*;
public class array_review
{
public static void main(String Args[])throws IOException
{
array_review ob=new array_review();
ob.input();
}
public void input()throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int num[]=new int[5];
 int new_num[]=new int[num.length];
 for(int i=0;i<num.length;i++)
 {
  System.out.println("Enter number"+(i+1)+" :");
  num[i]=Integer.parseInt(br.readLine());
 }
 for(int i=0;i<num.length;i++)
  {
   for(int j=1;j<=num[i];j++)
    {
     if(num[i]%j==0)
     {
      new_num[i]+=j;
     }
    }

  }
  for(int i=0;i<num.length;i++)
  {
   System.out.println(num[i]+"\t"+new_num[i]);
  }

}

}