import java.io.*;

class chwck1
{
private char a;

public static void main(String Args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a Character!!");
char a=(char)br.read();
System.out.println(Character.isLowerCase(a));
System.out.println(Character.isUpperCase(a));
System.out.println(Character.isDigit(a));
System.out.println(Character.isLetter(a));
System.out.println(Character.isWhitespace(a));
System.out.println(Character.toUpperCase(a));
System.out.println(Character.toLowerCase(a));
}}