import java.io.*;
public class Txt_bk_pg_276_July_3_2015
{
public void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int arr[]=new int[5];

for(int i=0;i<5;i++)
{
System.out.println("Enter Number"+(i+1)+" :");
arr[i]=Integer.parseInt(br.readLine());
}

System.out.println();

for(int i=arr.length-1;i>=0;i--)
{

for(int j=0;j<=i;j++)
System.out.print(arr[j]+" ");

System.out.println();

for(int j=0;j<i;j++)
arr[j]=arr[j]+arr[j+1];

}

}

public static void main(String Args[])throws IOException
{
Txt_bk_pg_276_July_3_2015 ob=new Txt_bk_pg_276_July_3_2015();
ob.input();

}}
