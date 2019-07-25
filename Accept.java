import java.io.*;
public class Accept
 {
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

 public int accept_int(String msg)throws IOException
  {
  int ans;

  while(true)
   {
   try
   {
   System.out.println(msg);
   ans=Integer.parseInt(br.readLine());
   return ans;
   }
   catch(NumberFormatException e)
   {
   System.out.println("Enter a positive Integer only");
   }
  }
 }

 public static void main(String Args[])throws IOException
 {
 int permno,rollno;
 Accept a=new Accept();
 permno=a.accept_int("Enter permno");
 rollno=a.accept_int("Enter roll no");
 }
 }