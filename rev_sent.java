import java.io.*;
public class rev_sent
{


public String reverse(String word)
{
	String rev= " ";
	for(int i=word.length()-1;i>=0;i--)
	{
	rev=rev+word.charAt(i);
	}
		return rev;
}

public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence");
String str=br.readLine()+" ";
String rev="";
String output=" ";
char ch;
String word=" ";
int start=0;

for(int i=0;i<str.length();i++)
{
	ch=str.charAt(i);
	if(ch==' ')
	{
		word=str.substring(start,i);
		start=i+1;
		output=output+reverse(word)+" ";
	}
}
System.out.println("\n"+str + " becomes " + output);
}

public static void main(String Args[])throws IOException
{
rev_sent ob=new rev_sent();
ob.cal();
}
}