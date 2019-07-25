6import java.io.*;
public class descend_sent
{
 public static void main(String Args[])throws IOException
 {
  descend_sent ob=new descend_sent();
  ob.input();
 }

 public void input()throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter sentence:");
  String s=br.readLine().toUpperCase().trim()+" ";
  int space=0;
  char ch=' ';

  for(int i=0;i<s.length();i++)
  {
   ch=s.charAt(i);
   if(ch==' ')
    space++;
  }

  String se[]=new String[space];
  int start=0;

  for(int i=0;i<se.length;i++)
  {
	for(int j=start;j<s.length();j++)
   {ch=s.charAt(j);
    if(ch==' ')
    {
     se[i]=s.substring(start,j);
     start=j+1;
     break;
   }
   }
  }

  char word[];

  for(int i=0;i<se.length;i++)
  {
	  word=se[i].toCharArray();

  }

 }

}