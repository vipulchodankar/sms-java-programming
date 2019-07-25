import java.io.*;
public class binfibonacci
{
public void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=0,b=1,c;
System.out.println("Enter number of terms");
int n=Integer.parseInt(br.readLine());
System.out.print(a+" "+b+"\n");
int i=3;
while(i<=n)
{
c=a+b;
System.out.println(" "+c);
a=b;
b=c;
i++;
}
}

public static void main(String Args[])throws IOException
{
binfibonacci ob=new binfibonacci();
ob.input();
}
}