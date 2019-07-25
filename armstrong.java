import java.io.*;
public class armstrong
{

 public static void main(String Args [])throws IOException
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter a number");
     int num=Integer.parseInt(br.readLine());
	 int num1=num;
	 int rem=0;
	 int sum=0;

    while(num1>0)
     	{
      	 rem=num1%10;
      	 sum=sum+(rem*rem*rem);
      	 num1=num1/10;
      	 }

		if(sum==num)
		System.out.println("The number entered is an Armstrong number");
		else
		System.out.println("The number entered is not an Armstrong number");

	}


}