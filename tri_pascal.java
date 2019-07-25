import java.io.*;
public class tri_pascal
{
 public static void main(String Args[])throws IOException
 {
  tri_pascal ob=new tri_pascal();
  ob.input();
 }
 public void input()throws IOException
 {
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter number of rows:");
 int n=Integer.parseInt(br.readLine());
 System.out.println();
 int ar[]=new int[n+1];
 ar[0]=1;
 for(int i=0;i<n;i++)
 {
  for(int j=0;j<=i;j++)
  {
   System.out.print(ar[j]+"  ");
  }
  System.out.println();
  for(int j=i+1;j>=1;j--)
  {
   ar[j]=ar[j]+ar[j-1];
  }
 }

 }
}
