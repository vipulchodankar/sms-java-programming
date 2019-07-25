import java.io.*;
class P9
{
public static void main(String Args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int op;
System.out.println("1. To find area of circle");
System.out.println("2. To find area of rectangle");
System.out.println("3. To find area of square");
System.out.println("4. To Exit");

System.out.println("Enter Your Option - 1.2.3 or 4");
 op=Integer.parseInt(br.readLine());
switch(op)
 {
  case 1:
 {
 System.out.println("Enter radius");
 double r=Double.parseDouble(br.readLine());
 System.out.println("Area = "+(3.14*r*r)+"sq. units");
 break;
 }
 case 2:
  {
	  System.out.println("Enter Length:");
  double p=Double.parseDouble(br.readLine());
  System.out.println("Enter Breadth:");
  double q=Double .parseDouble(br.readLine());
  System.out.println("Area = "+(p*q)+"sq. units");
 break;
 }
case 3:
 {
 System.out.println("Enter side:");
 double m =Double.parseDouble(br.readLine());
 System.out.println("Area = "+(m*m)+"sq. units");
 break;
 }
case 4:
{
	System.exit(0);
break;
}
default:
 System.out.println("Invalid");
}
}
}