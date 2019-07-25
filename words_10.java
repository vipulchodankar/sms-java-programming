import java.io.*;

public class words_10
{

 public void input()throws IOException
 {

 String max="";
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter no. of words");
  int num=Integer.parseInt(br.readLine());
  String s[]=new String[num];
  for(int i=0;i<s.length;i++)
   {
     System.out.println("Enter Word"+(i+1)+" :");
     s[i]=br.readLine();
   }

  for(int i=0;i<s.length;i++)
  {
	  if(s[i].length()>max.length())
	   max=s[i];
  }
   System.out.println("\nLongest Word = "+max);

  String temp="";
  String or="";
  for(int i=0;i<s.length;i++)
  {

	 for(int j=s[i].length()-1;j>=0;j--)
	 {
	  temp+=s[i].charAt(j);
	 }

	 if(temp.equalsIgnoreCase(s[i]))
	 System.out.println(temp+" is a palidrome");
	 temp="";
  }

 }

 public static void main(String Args[])throws IOException
 {
  words_10 ob=new words_10();
  ob.input();
 }

}