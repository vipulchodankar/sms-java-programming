import java.io.*;
public class palidrome
{
public static void main(String Args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter digits");
     int num=Integer.parseInt(br.readLine());
     int rev=0;
     int rem;
     int num1=num;

     while(num>0)
     {
       rem=num%10;
       rev=rev*10+rem;
       num=num/10;
     }
     if(num1==rev)
     {
     System.out.println(num1+" is a palidrome number");}
     else
     {System.out.println(num1+" is a not palidrome number");}

     }
 }