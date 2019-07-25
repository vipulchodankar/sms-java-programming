import java.io.*;
public class l_word
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence");
String str=br.readLine()+" ";
String word="";
String l_word=" ";
int max_length=0;
int start=0;
char ch;
for(int i=0;i<str.length();i++)
{
ch=str.charAt(i);
if(ch==' ')
{word=str.substring(start,i);}
if(word.length()>max_length)
{
max_length=word.length();
l_word=word;}
start=i+1;

}
System.out.println("longest word= "+l_word);
}
public static void main(String Args[])throws IOException
{
	l_word ob=new l_word();
	ob.cal();
}
}
