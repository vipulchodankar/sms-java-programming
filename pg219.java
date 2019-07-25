import java.io.*;
public class pg219
{
public static void divide()
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

try
{int a=Integer.parseInt(br.readLine()),b=Integer.parseInt(br.readLine());
System.out.println(a/b);}

catch(IOException e2)
{System.out.println("IOException Handled");}

catch(ArithmeticException e)
{System.out.println("");}
catch(NumberFormatException e3)
{System.out.println("Enter numbers only");}

System.out.println("hello");

}
public static void main(String Args[])
{
pg219 ob=new pg219();
ob.divide();
}
}