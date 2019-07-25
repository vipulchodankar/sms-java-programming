import java.io.*;
public class Accept_multi
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  int a;
  public void i_nt()throws IOException
  {
  System.out.println("Enter an integer");
  try
  {a=Integer.parseInt(br.readLine());}
  catch(NumberFormatException e)
  {System.out.println("Enter ONLY an integer");
   a=Integer.parseInt(br.readLine());}
  }
   double b ;

   public void d_ouble()throws IOException
   {
    System.out.println("Enter an double");
    b=Double.parseDouble(br.readLine());
   }
   char c;

   public void c_har()throws IOException
   {
    System.out.println("Enter an char");
    c=(char)(br.read());
   }
   String d="";

   public void s_tring()throws IOException
   {
   System.out.println("Enter a sentence");
   d=br.readLine();
   }
}