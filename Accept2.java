import java.io.*;
public class Accept2
 {
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

 public double accept_dou(String msg)throws IOException
  {
  double ans;

  while(true)
   {
   try
   {
   System.out.println(msg);
   ans=Double.parseDouble(br.readLine());
   return ans;
   }
   catch(NumberFormatException e)
   {
   System.out.println("Enter Integer only");
   }
  }
 }

 public static void main(String Args[])throws IOException
 {
 double permno,rollno;
 Accept2 a=new Accept2();
 permno=a.accept_dou("Enter permno");
 rollno=a.accept_dou("Enter roll no");
 }
 }