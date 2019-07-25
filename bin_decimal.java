import java.io.*;
public class bin_decimal
{
public void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int num,rem,bin=0,i=0;
System.out.println("Enter binary no.");
num=Integer.parseInt(br.readLine());
int num2=num;

while(num>0)
{
rem=num%10;
bin+=Math.pow(2,i)*rem;
num/=10;
i++;
}
System.out.println(num2+" in decimal = "+bin);
}
public static void main(String Args[])throws IOException
{
bin_decimal ob=new bin_decimal();
ob.input();
}
}