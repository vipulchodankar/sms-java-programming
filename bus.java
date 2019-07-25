import java.io.*;
class bus
{
private double km,fare;
public bus()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Distance travelled");
km=Double.parseDouble(br.readLine());

if(km>=0 && km<=1)
 fare=4;

else if(km>=1 && km<5)
 fare=4+(km-1)*4;

else if(km>=5 && km<11)
 fare=4+16+(km-5)*6;

else if(km>15)
 fare=80+(km-10-4-1)*8;

System.out.println("Bus Fare =Rs."+fare);
}
public static void main(String Args[])throws IOException
{
bus ob=new bus();
}}