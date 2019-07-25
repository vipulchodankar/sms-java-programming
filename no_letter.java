import java.io.*;
public class no_letter
{
public void chk()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence");
String str=br.readLine();
str=str.toLowerCase();
char ch;
int a=0;
int e=0;
int i=0;
int o=0;
int u=0;
for(int I=0;I<str.length();I++)
{
 ch=str.charAt(I);

 switch(ch)
 {
 case 'a':
  a++;break;

  case 'e':
  e++;break;

 case 'i':
  i++;break;

 case 'o':
  o++;break;

 case 'u':
  u++;break;
}
}
System.out.println(str+" has"+"\n a = "+a+"\n e ="+e+"\n i = "+i+"\n o ="+o+"\n u = "+u);
}
public static void main(String Args[])throws IOException
{
no_letter ob=new no_letter();
ob.chk();
}
}