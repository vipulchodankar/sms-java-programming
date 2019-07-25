import java.io.*;
class circle
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
private double pi,r,p,ar;

public circle()throws IOException
{
pi=3.14;
System.out.println("Enter radius of circle ");
r=Double.parseDouble(br.readLine());
ar=pi*r*r;
p=2*pi*r;
System.out.println("Area of circle = "+ar);
System.out.println("Perimeter of circle = "+p);
}

public static void main(String args[])throws IOException
{
circle c=new circle();
}
}