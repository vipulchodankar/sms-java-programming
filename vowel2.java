import java.io.*;
class vowel2
{
private char ch;
public vowel2()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter A Character - ");
ch=(char)br.read();
ch=Character.toLowerCase(ch);

if(Character.isLetter(ch))
{
 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
  System.out.println("Character is a vowel");
 else
  System.out.println("Character is not a vowel");
}
 else
  System.out.println("Invalid");


}

public static void main(String Args[])throws IOException
{
vowel2 ob=new vowel2();
}
}
