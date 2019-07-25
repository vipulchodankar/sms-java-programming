import java.io,*;
public class cal
{
private double op,no1,no2,res;

public void cal1()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter Number 1 ");
no1=Double.parseDouble(br.readLine());

System.out.println("Enter Operator (e.g.- +,-)");
op=(char)br.read();

System.out.println("Enter Number");
no2=Double.parseDouble(br.readLine());

if(op=='*' || op=='x')
res=no1*no2;

if else(no1>no2 && op=='/')
res=no1/no2;

if else(op=='+')
res=no1+no2;

if else()
