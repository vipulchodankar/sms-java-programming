import java.io.*;
public class do_loop1
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num=0;
char ch;

do
{
System.out.println("\n Enter number : ");
num=Integer.parseInt(br.readLine());
System.out.println(Math.sqrt(num));
System.out.println("\n Do you wish to continue ? Y/N ?");
ch=(char)br.read();
br.readLine();
}while(ch=='y' || ch=='Y');

}

public static void main(String Args[])throws IOException
{
do_loop1 ob=new do_loop1();
ob.cal();
}
}