import java.io.*;

public class Array_char
{

public void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

char arm[]=new char[10];

int vow_no=0;
char ch;

for(int i=0;i<10;i++)
{
System.out.println("Enter character no."+(i+1)+" :");
ch=Character.toLowerCase((char)br.read());
br.readLine();

if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
vow_no++;

arm[i]=ch;
}

char vow[]=new char[vow_no];
char con[]=new char[arm.length-vow_no];

int k=0;
int j=0;
for(int i=0;i<10;i++)
{
	if(arm[i]=='a' || arm[i]=='e' || arm[i]=='i' || arm[i]=='o' || arm[i]=='u')
   {vow[k]=arm[i];k++;}
   else
   {con[j]=arm[i];j++;}

}

System.out.println();
for(int i=0;i<arm.length;i++)
System.out.println(arm[i]);

System.out.println("\n"+"vowels are:");
for(int a=0;a<vow_no;a++)
System.out.println("vowel "+(a+1)+" is "+vow[a]);

System.out.println("\n"+"consonants are:");
for(int a=0;a<con.length;a++)
System.out.println("Consonant "+(a+1)+" is "+con[a]);

}


public static void main(String Args[])throws IOException
{
Array_char ob=new Array_char();
ob.input();
}

}