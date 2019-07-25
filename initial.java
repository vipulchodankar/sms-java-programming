import java.io.*;
public class initial
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your name");
String str=br.readLine();
char ch;
int start=0;
String word="";
String name="";

for(int i=0;i<str.length;i++)
{
ch=str.charAt(i);
if(ch=' ')
{
 word=str.charAt(start);
 name=name+word+".";
}
}
System.out.print(str.char())
}
}