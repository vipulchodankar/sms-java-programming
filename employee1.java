import java.io.*;
class employee1

{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

private String name,gender;

private

double age;

public void emp()throws IOException
{
System.out.println("Enter Employee's Name : ");
name=br.readLine();
System.out.println("Enter Employee's Gender : ");
gender=br.readLine();
System.out.println("Enter Employee's Age : ");
age=Double.parseDouble(br.readLine());
System.out.println("Employee's Name is "+name);
System.out.println("Employee's Age is "+age);
System.out.println("Employee's gender "+gender);
}

public static void main(String Args[])throws IOException
{
employee1 e=new employee1();
e.emp();
}}