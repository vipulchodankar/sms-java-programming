import java.io.*;
public class week
{
public void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String week[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
char ch;
do{
try{
System.out.println("Enter day(1 to 7)");
int day=Integer.parseInt(br.readLine());
System.out.println(week[day-1]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Invalid day.Plz try again!");
}
System.out.println("Do you wish to proceed? Y or N.");
ch=(char)br.read();
br.readLine();
}while(ch=='y' || ch=='Y');
}
public static void main(String Args[])throws IOException
{
week ob=new week();
ob.input();
}
}