import java.io.*;
public class password
{
public void cal()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String pass="abcd";
String pswd="";
int wrong=1;

do
{
System.out.println("Enter Password");
pswd=br.readLine();

if(pswd.equals(pass))
{
System.out.println("Great!U have acess to the program");
break;
}

else
{
wrong++;
System.out.println("Incorrect try again \n");
}

if(wrong==4)
System.out.println("Sorry! Acess denied");


}while(wrong<=3);

}
public static void main(String Args[])throws IOException
{
password ob=new password();
ob.cal();
}

}