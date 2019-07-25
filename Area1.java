import java.io.*;

class Area1
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

private double l,b,area;

public void input()throws IOException

{

System.out.println("Enter length in m ");

l=Double.parseDouble(br.readLine());

System.out.println("Enter breadth in m ");

b=Double.parseDouble(br.readLine());
}

public void cal_area()

{
	area=l*b;

	System.out.println("Area = "+area+"sq.m");

}

public static void main(String Args[])throws IOException

{

	Area1 a=new Area1();

	a.input();

	a.cal_area();

}}