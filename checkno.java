import java.io.*;

public class checkno

{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

public void check()throws IOException

{

System.out.println("Enter Number");

int num=Integer.parseInt(br.readLine());

if(num%2==0)

System.out.println("Number is even");

else

System.out.println("Number is odd");

}

public static void main(String Args[])throws IOException

{

checkno ob=new checkno();

ob.check();

}}