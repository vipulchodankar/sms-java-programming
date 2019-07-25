import java.io.*;
public class PG226_Q1
{
public void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter first sentence :");
String one=br.readLine();

System.out.println("Enter second sentence :");
String two=br.readLine();

System.out.println(one.equals(two));
}
public static void main(String Args[])throws IOException
{
PG226_Q1 ob=new PG226_Q1();
ob.input();
}}
