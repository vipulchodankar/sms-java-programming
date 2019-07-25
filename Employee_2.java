import java.io.*;
public class Employee_2
{
private String name,dob;
private double basic,da,hra,gross;

public void input()throws IOException
{
System.out.println("Enter Empolyee's name");
name=br.readLine();

System.out.println("Enter Empolyee's Date Of Birth (DD//MM//YYYY)");
dob=br.readLine();

System.out.println("Enter Empolyee's Basic Pay");
basic=Double.parseInt();
}

public void cal()throws IOException
{
da=basic/2;
hra=basic/4;
gross=da+hra;
}

public void display()throws IOException
{
System.out.println("Employee's Name = "+name);
System.out.println("Employee's  Date Of Birth = "+dob);
System.out.println("Employee's Basic Pay = "+basic);
System.out.println("Employee's DA = "+da);
System.out.println("Employee's HRA = "+hra);
}

}