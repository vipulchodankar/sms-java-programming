import java.io.*;
public class adddigit
{
  public static void main(String Args [])throws IOException
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter digits");
     int num=Integer.parseInt(br.readLine());
     int sum=0;
     int rem;

     while(num>0)
     {
       rem=num%10;
       sum=sum+rem;
       num=num/10;
     }
     System.out.println("Sum Of Digits = "+sum);
    }
   }