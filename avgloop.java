import java.io.*;
public class avgloop
{

public void calc()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

Double phy,bio,chem,avg;
int i=1;
int stud=1;

while(i<=5)
{
  System.out.println("Enter Physics Marks");
  phy=Double.parseDouble(br.readLine());

  System.out.println("Enter Biology Marks");
  bio=Double.parseDouble(br.readLine());

  System.out.println("Enter Chemistry Marks");
  chem=Double.parseDouble(br.readLine());

  avg=(phy+chem+bio)/3;
  System.out.println("Average of Student"+stud+"= "+avg+"\n");
  i++;
}

}

public static void main(String Args[])throws IOException
{
avgloop ob=new avgloop();
ob.calc();
}

}