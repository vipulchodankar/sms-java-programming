import java.io.*;
class nest9
{
public static void main(String Args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();

for(int i=1;i<=str.length();i++)
{
System.out.print(str.substring(0,i));
System.out.println();

}
}
}