import java.io.*;
public class occ_sp
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter A Sentence");
String str=br.readLine();
char ch;
int sp=0;
for(int i=0;i<str.length();i++)
{
ch=str.charAt(i);

if(ch=='s' && str.charAt(++i)=='p')
 sp++;
}
System.out.println("Occurence of sp = "+sp);
}

public static void main(String Args[])throws IOException
{
occ_sp ob=new occ_sp();
ob.cal();
}
}

