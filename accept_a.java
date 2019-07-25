import java.io.*;
public class accept_a
{
int a;

 public void i_nt()throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter an integer");
  a=Integer.parseInt(br.readLine());
 }
}