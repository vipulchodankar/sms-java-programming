import java.io.*;
public class str_palidrome
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a word to check if it is a palidrome word");
String word=br.readLine();
word=word.toLowerCase();
String rev="";
char ltr;
for(int i=word.length()-1;i>=0;i--)
{
 ltr=word.charAt(i);
 rev=rev+ltr;
}

if(rev.equals(word))
 System.out.println(word+" is a palidrome word");
else
 System.out.println(word+" is not a palidrome word");

}
public static void main(String Args[])throws IOException
{
str_palidrome ob=new str_palidrome();
ob.cal();
}
}