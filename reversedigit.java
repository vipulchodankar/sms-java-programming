import java.io.*;
public class reversedigit
{
  public static void main(String Args [])throws IOException
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter digits");
     int num=Integer.parseInt(br.readLine());
     int rev=0;
     int rem;

     while(num>0)
     {
       rem=num%10;
       rev=rev*10+rem;
       num=num/10;
     }
     System.out.println("REVERSED NUMBER = "+rev);
    }
   }