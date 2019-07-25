import java.io.*;
public class great_small
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int no=0;
int big=0;
System.out.println("Enter 1st number");
int num=Integer.parseInt(br.readLine());
int small=num;

for(int i=2;i<=10;i++)
{
System.out.println("Enter "+i+"/nd/th number");
no=Integer.parseInt(br.readLine());
num=no;

if(no>big)
 big=no;

else if(no<small)
 small=no;

}
System.out.println("Biggest number = "+big+"\nSmallest number ="+small);
}
public static void main(String Args[])throws IOException
{
great_small ob=new great_small();
ob.cal();
}
}