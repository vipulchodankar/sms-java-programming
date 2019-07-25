import java.io.*;

class bill
{
private double net,dis,amt;

public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println(":) Please Enter Amount :)");
amt=Double.parseDouble(br.readLine());

if(amt >10000)
  dis=25;
 else if(amt>5000 && amt<=10000)
   dis=20;
 else if(amt>2000 && amt<=5000)
   dis=10;
 else if(amt>=1000 && amt <=2000)
   dis=5;
 else if(amt <1000)
  dis=0;

System.out.println("Discount ="+dis+"% Yay!");
net=amt-(dis/100.0*amt);
System.out.println("Net Price = Rs."+net);
}

public static void main(String Args[])throws IOException
{bill ob=new bill();
ob.cal();
}}