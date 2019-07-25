import java.io.*;
public class occurence
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence : ");
String str=br.readLine();
str=str.toLowerCase();
char ltr;
int digit=0,letter=0,special=0;
 for(int i=0;i<str.length();i++)
 {
  ltr=str.charAt(i);

  if(Character.isLetter(ltr))
   letter++;
  else if(Character.isDigit(ltr))
   digit++;
  else if(ltr!=' ')
   special++;
 }
System.out.println("Letters = "+letter);
System.out.println("Digits = "+digit);
System.out.println("Special Characters = "+special);
}

public static void main(String Args[])throws IOException
{
occurence ob = new occurence();
ob.cal();
}
}