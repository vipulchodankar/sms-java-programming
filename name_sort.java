import java.io.*;
public class name_sort
{
 public void input()throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter A Name");
  String name=br.readLine().toUpperCase();
  char ch,temp;
  char ar[]=new char[name.length()];
  for(int i=0;i<name.length();i++)
  {
	 ch=name.charAt(i);
	 ar[i]=ch;
	 if( (int)(name.charAt(i)) > (int)(name.charAt(i+1)) )
	 {
 		ar[i]=name.charAt(i);
 		ar[i+1]=name.charAt(i+1);
	 }
  }
  for(int i=0;i<name.length();i++)
   {
	 System.out.print(ar[i]);
   }


 }
  public static void main(String Args[])throws IOException
  {
	 name_sort ob=new name_sort();
	 ob.input();
   }


}