import java.io.*;
public class Ary_com
{
public static void main(String Args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Ente first sentence");
String s1=br.readLine();

System.out.println("\nEnter second sentence");
String s2=br.readLine();

boolean arr3[]=new boolean[s1.length()];

char arr1[]=s1.toCharArray();
char arr2[]=s2.toCharArray();

for(int i=0;i<arr1.length;i++)
{
if(arr1[i]==arr2[i])
arr3[i]=true;
else
arr3[i]=false;
}

for(int i=0;i<arr3.length;i++)
{
System.out.println(arr3[i]+" ");
}
System.out.println();

}
}