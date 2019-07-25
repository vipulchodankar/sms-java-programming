import java.io.*;
class vowel
{
private char ch;
public vowel()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter A Character - ");
ch=(char)br.read();
ch=Character.toLowerCase(ch);

switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
{
System.out.println(ch+" is a vowel");
break;}
default:
System.out.println(ch+" is not a vowel");
}
}

public static void main(String Args[])throws IOException
{
vowel ob=new vowel();
}
}
