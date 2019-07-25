import java.io.*;
class sq_for
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int num=Integer.parseInt(br.readLine());
int sum=0;
 for(int i=1;i<num;i++)
  {
   sum=sum+(i*i);
  }
System.out.println("sum = "+sum);
}

public static void main(String Args[])throws IOException
{
sq_for ob=new sq_for();
ob.cal();
}
}