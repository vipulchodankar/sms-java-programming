import java.io.*;
class Phone
{
private double calls,cost;

public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter number of calls");
calls=Double.parseDouble(br.readLine());
if(calls<=100)
 cost=100;
else if(calls >100 && calls<=150)
 cost=100+(calls-100)*2;
else if(calls>150)
 cost=100+50*2+(calls-150)*2.5;
System.out.println("Call Charges =Rs."+cost);
}

public static void main(String Args[])throws IOException
{Phone p=new Phone();
p.cal();
}
}