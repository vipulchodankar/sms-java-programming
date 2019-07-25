import java.io.*;
class age
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 public void check()throws IOException
 {
 System.out.println("Enter Name");
 String name=br.readLine();

 System.out.println("Enter Age");
 int age=Integer.parseInt(br.readLine());

 if (age>=18)
 System.out.println(name+" is a major");
 else
 System.out.println(name+" is a minor");
 }

 public static void main(String Args[])throws IOException
 {
 age ob=new age();
 ob.check();
 }
 }

