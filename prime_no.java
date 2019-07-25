import java.io.*;
public class prime_no
{

public void chk_prime()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number");
int num=Integer.parseInt(br.readLine());

int i=1;
int rem;
int count=0;

while(i<=num);
{
  rem=num%i;
  if(rem==0)
   count++;
  i++;
 }

if(count==2)
 System.out.println(num+" is a prime number");
else
 System.out.println(num+" is not a prime number");
}


public static void main(String Args[])throws IOException
{
prime_no ob=new prime_no();
ob.chk_prime();
}
}