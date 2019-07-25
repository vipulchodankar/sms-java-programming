import java.io.*;
public class revision1
{
public static void main(String Args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int n=Integer.parseInt(br.readLine());
int product=1;
int digit;
for(;n>0;)
 {
 digit=n%10;
 product=product*digit;
 n/=10;
 }
System.out.println(product);
}
}