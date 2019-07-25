import java.io.*;
public class letter
{
public void chk()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence");
String str=br.readLine();
str=str.toLowerCase();
char ch;
int vowel=0;
int con=0;
for(int i=0;i<str.length();i++)
{
 ch=str.charAt(i);
  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	vowel++;
  else if(ch!=' ')
  	con++;
}
System.out.println(str+" has "+vowel+" vowels and "+con+" consonants");
}
public static void main(String Args[])throws IOException
{
letter ob=new letter();
ob.chk();
}
}