import java.io.*;
class TAX
{
private double income,tax=0;
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter your name");
String name=br.readLine();

System.out.println("Enter Your Income");
income=Double.parseDouble(br.readLine());


if(income<=40000)
tax=0;

else if(income>40000 && income<=70000)
tax=(income-40000)*0.2;

else if(income>70000 && income <=100000)
tax=30000*0.2+(income-70000)*0.3;

else if(income<100000)
tax=(30000*0.2)+(30000*0.3)+(income-100000)*0.4;

System.out.println("Name = "+name);
System.out.println("Income = Rs."+income);
System.out.println("Tax = Rs."+tax);
}
public static void main(String Args[])throws IOException
{
	TAX ob=new TAX();
	ob.cal();
}}