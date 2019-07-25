import java.io.*;
public class Bubble_sort2
{

public void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no. of characters");
int num=Integer.parseInt(br.readLine());
String ar[]=new String[num];


for(int t=0;t<ar.length;t++)
{System.out.println("Enter String"+(t+1)+" :");
ar[t]=br.readLine();
}

String temp;
for(int i=0;i<ar.length;i++)
{
for(int j=0;j<ar.length-1;j++)
{
if(ar[j].compareTo(ar[j+1])>0);
{temp=ar[j];
ar[j]=ar[j+1];
ar[j+1]=temp;}
}

}
System.out.println();
for(int t=0;t<ar.length;t++)
System.out.println((String)ar[t]);

System.out.println("\nC ya Later!");
}

public static void main(String Args[])throws IOException
{Bubble_sort2 ob=new Bubble_sort2();
ob.input();
}
}