import java.io.*;
public class grade
{
public void check()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println(":) Enter your percentage :) ");
 double perc=Double.parseDouble(br.readLine());

if(perc>=90 && perc<=100)
	System.out.println(":) Your Grade is A! :)");
else if(perc>=80 && perc<90)
	System.out.println(":) Your Grade is B :)");
else if(perc>=70 && perc<80)
	System.out.println(":| Your Grade is C :|");
else if(perc>=60 && perc<70)
	System.out.println(":O Your Grade is D :O");
else if(perc>=40 && perc<60)
	System.out.println(":( Your Grade is E :(");
else if(perc<40)
	System.out.println(":'( Your Grade is F!! :'(");
else if(perc>100 || perc<0)
	System.out.println("Liar!! Invalid!!");

}

public static void main(String Args[])throws IOException
{
grade ob=new grade();
ob.check();
}}